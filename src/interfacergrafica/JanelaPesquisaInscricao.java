
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacergrafica;





import entidades.Inscricao;
import entidades.Jogador;
import entidades.Torneio;
import fabricaabstrata.CategoriaAbstrata;
import interfaces.PopularCombo;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import negocio.NInscricao;
import negocio.NJogador;
import negocio.NTorneio;

/**
 *
 * @author aluno
 */
public class JanelaPesquisaInscricao extends javax.swing.JInternalFrame implements PopularCombo{
    
    private JDesktopPane principal;
    
    /**
     * Creates new form frmTipoAssociadoPesquisa
     */
    public JanelaPesquisaInscricao() {
        initComponents();
        popularCombo();
    }
    
    public JanelaPesquisaInscricao(JDesktopPane principal){
        this();
        this.principal = principal;
    }
    
    public JanelaPesquisaInscricao(JDesktopPane principal, Inscricao inscricao){
        this();
        this.principal = principal;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnFechar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblResultado = new javax.swing.JTable();
        cmbCategoria = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAtivar = new javax.swing.JToggleButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setTitle("Pesquisa Jogadores");

        btnFechar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        tblResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblResultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblResultadoMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblResultado);

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categoria" }));
        cmbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoriaActionPerformed(evt);
            }
        });

        jLabel1.setText("Mostrar usuário do:");

        jLabel2.setText("Ativar mouse:");

        btnAtivar.setText("Mouse Desativado");
        btnAtivar.setEnabled(false);
        btnAtivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtivarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtivar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtivar)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnFechar)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        try {
            JanelaInscricao janela = new JanelaInscricao(principal);
            principal.add(janela);
            janela.setVisible(true);
            this.dispose();
        } catch (Exception e) {
//            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_btnFecharActionPerformed

    private void cmbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriaActionPerformed
        try {
            preencherTabela(cmbCategoria.getSelectedIndex());
            btnAtivar.setEnabled(true);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_cmbCategoriaActionPerformed

    private void tblResultadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblResultadoMousePressed
        try {
            if(btnAtivar.isSelected()){
                int linha = tblResultado.getSelectedRow();
                String codigo = tblResultado.getValueAt(linha,0).toString();
                String codigoTor = tblResultado.getValueAt(linha,2).toString();
                
                Inscricao inscricao = new NInscricao().consultar(Integer.parseInt(codigo));
                
                JanelaInscricao janela = new JanelaInscricao(principal, inscricao);

                principal.add(janela);
                janela.setVisible(true);
                this.dispose();
            } else{
                
            }
        } catch (Exception e) {
//            JOptionPane.showMessageDialog(rootPane, e.getMessage());
                e.printStackTrace();
        }
    }//GEN-LAST:event_tblResultadoMousePressed

    private void btnAtivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtivarActionPerformed
        if(btnAtivar.isSelected()){
            btnAtivar.setText("Mouse ativado");
            tblResultado.setEnabled(true);
        } else{
            tblResultado.setRowSelectionAllowed(false);
            tblResultado.setEnabled(false);
            btnAtivar.setText("Mouse desativado");
        }
    }//GEN-LAST:event_btnAtivarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAtivar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblResultado;
    // End of variables declaration//GEN-END:variables
    
    @Override
    public void popularCombo() {
        try {
            cmbCategoria.removeAllItems();
            ArrayList<String> listaCat = CategoriaAbstrata.getListaDeFabricas();
            listaCat.forEach(categoria -> {
                cmbCategoria.addItem(categoria);
            });
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }
    
    private void preencherTabela(int index) {
        try {
            
            Vector<String> cabecalho = new Vector<>();
            cabecalho.add("Código");
            cabecalho.add("Torneio");
            cabecalho.add("Código do Torneio");
            cabecalho.add("Jogador");
            cabecalho.add("Código do Jogador");
            cabecalho.add("Código da Categoria");
            
            switch(index){
                case 0: 
                    Vector detalhe = new Vector<>();
                    new NInscricao().listar().forEach(torneio -> {
                        Vector<String> linha = new Vector<>();
                        if(torneio.getJogador().getCategoria().getIdCat() == index){
                            linha.add(Integer.toString(torneio.getIdInscricao()));
                            linha.add(torneio.getTorneio().getDescricao());
                            linha.add(Integer.toString(torneio.getTorneio().getId()));
                            linha.add(torneio.getJogador().getNome());
                            linha.add(Integer.toString(torneio.getJogador().getId()));
                            linha.add(Integer.toString(torneio.getJogador().
                                    getCategoria().getIdCat()));
                            detalhe.add(linha);
                        }
                    });
                    tblResultado.setModel(new DefaultTableModel(detalhe, cabecalho));
                    break;
                case 1: 
                    Vector detalhe2 = new Vector<>();
                    new NInscricao().listar().forEach(torneio -> {
                        Vector<String> linha = new Vector<>();
                        if(torneio.getJogador().getCategoria().getIdCat() == index){
                            linha.add(Integer.toString(torneio.getIdInscricao()));
                            linha.add(torneio.getTorneio().getDescricao());
                            linha.add(Integer.toString(torneio.getTorneio().getId()));
                            linha.add(torneio.getJogador().getNome());
                            linha.add(Integer.toString(torneio.getJogador().getId()));
                            linha.add(Integer.toString(torneio.getJogador().
                                    getCategoria().getIdCat()));
                            detalhe2.add(linha);
                        }
                    });
                    tblResultado.setModel(new DefaultTableModel(detalhe2, cabecalho));
                    break;
                case 2: 
                    Vector detalhe3 = new Vector<>();
                    new NInscricao().listar().forEach(torneio -> {
                        Vector<String> linha = new Vector<>();
                        if(torneio.getJogador().getCategoria().getIdCat() == index){
                            linha.add(Integer.toString(torneio.getIdInscricao()));
                            linha.add(torneio.getTorneio().getDescricao());
                            linha.add(Integer.toString(torneio.getTorneio().getId()));
                            linha.add(torneio.getJogador().getNome());
                            linha.add(Integer.toString(torneio.getJogador().getId()));
                            linha.add(Integer.toString(torneio.getJogador().
                                    getCategoria().getIdCat()));
                            detalhe3.add(linha);
                        }
                    });
                    tblResultado.setModel(new DefaultTableModel(detalhe3, cabecalho));
                    break;
                case 3: 
                    Vector detalhe4 = new Vector<>();
                    new NInscricao().listar().forEach(torneio -> {
                        Vector<String> linha = new Vector<>();
                        if(torneio.getJogador().getCategoria().getIdCat() == index){
                            linha.add(Integer.toString(torneio.getIdInscricao()));
                            linha.add(torneio.getTorneio().getDescricao());
                            linha.add(Integer.toString(torneio.getTorneio().getId()));
                            linha.add(torneio.getJogador().getNome());
                            linha.add(Integer.toString(torneio.getJogador().getId()));
                            linha.add(Integer.toString(torneio.getJogador().
                                    getCategoria().getIdCat()));
                            detalhe4.add(linha);
                        }
                    });
                    tblResultado.setModel(new DefaultTableModel(detalhe4, cabecalho));
                    break;
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
//            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }
}
