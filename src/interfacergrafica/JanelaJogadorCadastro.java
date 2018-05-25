/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacergrafica;


import javax.swing.JOptionPane;
import entidades.Jogador;
import fabricaabstrata.CategoriaAbstrata;
import interfaces.PopularCombo;
import java.util.ArrayList;
import javax.swing.JDesktopPane;
import negocio.NJogador;
import util.Validation;

/**
 *
 * @author aluno
 */
public class JanelaJogadorCadastro extends javax.swing.JInternalFrame implements PopularCombo{
    
    
    
    private JDesktopPane principal;
    
    /**
     * Creates new form frmTipoAssociadoCadastro
     */
    public JanelaJogadorCadastro() {
        initComponents();
        popularCombo();
    }
    
    public JanelaJogadorCadastro(JDesktopPane principal){
        this();
        this.principal = principal;
    }
    
    public JanelaJogadorCadastro(JDesktopPane principal, Jogador jogador){
        this();
        this.principal = principal;
        preencherTela(jogador);
    }
    
    private void limparTela(){
        txtIdentificador.setText("");
        txtNome.setText("");
        txtCpf.setText("");
        txtNome.requestFocus();
        btnExcluir.setEnabled(false);
        lblNomeAviso.setText("");
        cmbCategoria.setSelectedIndex(0);
        cmbCategoria.setEnabled(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtIdentificador = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        cmbCategoria = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        lblNomeAviso = new javax.swing.JLabel();
        lblCpfAviso = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setClosable(true);
        setTitle("Cadastro de Jogadores");
        setToolTipText("Código do Tipo Associado");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setText("Identificador");
        jLabel1.setToolTipText("");

        txtIdentificador.setEditable(false);

        btnPesquisar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Nome");
        jLabel2.setToolTipText("");

        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("CPF");

        txtCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCpfKeyTyped(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.setPreferredSize(new java.awt.Dimension(66, 32));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.setPreferredSize(new java.awt.Dimension(66, 32));
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnFechar.setText("Fechar");
        btnFechar.setPreferredSize(new java.awt.Dimension(66, 32));
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Categoria");

        lblNomeAviso.setBackground(new java.awt.Color(0, 0, 0));
        lblNomeAviso.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblNomeAviso.setPreferredSize(new java.awt.Dimension(41, 41));

        lblCpfAviso.setPreferredSize(new java.awt.Dimension(41, 41));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblCpfAviso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                .addComponent(lblNomeAviso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(30, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNomeAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCpfAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            Validation.isEmpty(validarCampos());
            Validation.invalidCaracAndLetters(txtCpf.getText());
            Validation.invalidSpaces(txtCpf.getText());
            
            Jogador jogador = new Jogador(JanelaPrincipal.cbfv);
            jogador.setNome(txtNome.getText());
            jogador.setCpf(txtCpf.getText());
            jogador.setCategoria(cmbCategoria.getSelectedIndex()+1);
            
            if(txtIdentificador.getText() != null && !txtIdentificador.getText().isEmpty()){
                jogador.setId(Integer.parseInt(txtIdentificador.getText()));
            }
            
            new NJogador().incluir(jogador);
            
            JOptionPane.showMessageDialog(null, "Jogador cadastrado com sucesso!");
            limparTela();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
//            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        try {
            limparTela();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            int resposta = JOptionPane.showConfirmDialog(null, 
                    "Confirma a exclusão do jogador?",
                    "Sistema Clube", JOptionPane.YES_NO_OPTION);
            
            if(resposta == JOptionPane.YES_OPTION){
                
                int id = Integer.parseInt(txtIdentificador.getText());
                String nome = txtNome.getText();
                int index = cmbCategoria.getSelectedIndex()+1;
                CategoriaAbstrata categoria = CategoriaAbstrata.getInstance(index);
                String cpf = txtCpf.getText();
                
                new NJogador().excluir(Integer.parseInt(
                        txtIdentificador.getText()));
                
                JanelaPrincipal.cbfv.removerObservador(new Jogador(id, nome, categoria, cpf));
                
                JOptionPane.showMessageDialog(null, 
                        "Operação efetuada com sucesso!");
                
                limparTela();
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            
            JanelaPesquisaJogador janela = new JanelaPesquisaJogador(principal);
            principal.add(janela);
            janela.setVisible(true);
            
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyTyped
        try {
            Validation.limitMaxCaracter(60, txtNome.getText(), evt);
            if(txtNome.getText().length() == 0) lblNomeAviso.setText("");
        } catch (Exception e) {
            lblNomeAviso.setText(e.getMessage());
        }
    }//GEN-LAST:event_txtNomeKeyTyped

    private void txtCpfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpfKeyTyped
        try {
            Validation.limitMaxCaracter(11, txtCpf.getText(), evt);
            if(txtCpf.getText().length() == 0) lblCpfAviso.setText("");
        } catch (Exception e) {
            lblCpfAviso.setText(e.getMessage());
        }
    }//GEN-LAST:event_txtCpfKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblCpfAviso;
    private javax.swing.JLabel lblNomeAviso;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtIdentificador;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

    private void preencherTela(Jogador jogador) {
        try {
            txtIdentificador.setText(jogador.getId() + "");
            txtNome.setText(jogador.getNome());
            txtCpf.setText(jogador.getCpf() + "");
            cmbCategoria.setSelectedItem(jogador.getCategoria().getDescricao());
            cmbCategoria.setEnabled(false);
            btnExcluir.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    @Override
    public void popularCombo(){
        try {
            cmbCategoria.removeAllItems();
            
            CategoriaAbstrata.getListaDeFabricas().forEach(categoria -> cmbCategoria.addItem(categoria));
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }
    
    private ArrayList<String> validarCampos(){
        ArrayList<String> lista = new ArrayList<>();
        
        lista.add(txtNome.getText());
        lista.add(txtCpf.getText());
        
        return lista;
    }
}
