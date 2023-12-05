package frontend;

import entities.Emprestimo;
import services.LivroService;
import entities.Livro;
import services.UsuarioService;
import entities.Usuario;
import services.EmprestimoService;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author felipe
 */
public class FrmDevolver extends javax.swing.JFrame {

    /**
     * Creates new form FrmDevolver
     */
    public FrmDevolver() {
        initComponents();
        carregarComboBoxUsuarios();
        carregarComboBoxLivros();
    }
    
    private void carregarComboBoxUsuarios() {
        List<Usuario> listaUsuarios = UsuarioService.obterListaUsuarios();
    
        // Limpa o ComboBox
        cbSelecionaUsuario.removeAllItems();
    
        // Adiciona os nomes dos usuários ao ComboBox
        for (Usuario usuario : listaUsuarios) {
            cbSelecionaUsuario.addItem(usuario.getNome());
        }
    }
    
    /*private void carregarComboBoxLivros() {
        String nomeUsuario = cbSelecionaUsuario.getSelectedItem().toString();
        Usuario usuario = UsuarioService.encontrarUsuario(nomeUsuario);

        if (usuario != null) {
            List<Emprestimo> emprestimosUsuario = EmprestimoService.obterEmprestimosPorUsuario(usuario);

            // Limpa o ComboBox
            cbSelecionaLivro.removeAllItems();

            // Adiciona os títulos dos livros emprestados ao ComboBox
            for (Emprestimo emprestimo : emprestimosUsuario) {
                Livro livro = emprestimo.getLivro();
                cbSelecionaLivro.addItem(livro.getTitulo() + " - " + livro.getIdioma());
            }
        }
    }*/
    
    private void carregarComboBoxLivros() {
    // Verifica se algum usuário está selecionado
    if (cbSelecionaUsuario.getSelectedItem() != null) {
        String nomeUsuario = cbSelecionaUsuario.getSelectedItem().toString();
        Usuario usuario = UsuarioService.encontrarUsuario(nomeUsuario);

        if (usuario != null) {
            List<Emprestimo> emprestimosUsuario = EmprestimoService.obterEmprestimosPorUsuario(usuario);

            // Limpa o ComboBox
            cbSelecionaLivro.removeAllItems();

            // Adiciona os títulos dos livros emprestados ao ComboBox
            for (Emprestimo emprestimo : emprestimosUsuario) {
                Livro livro = emprestimo.getLivro();
                cbSelecionaLivro.addItem(livro.getTitulo() + " - " + livro.getIdioma());
            }
        }
    }
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbSelecionaUsuario = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbSelecionaLivro = new javax.swing.JComboBox<>();
        btnDevolveLivro = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtSenhaDevolver = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextField1.setEditable(false);
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Devolver livro");

        jLabel1.setText("Selecione o Usuário:");

        cbSelecionaUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Selecione o Livro:");

        cbSelecionaLivro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbSelecionaLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSelecionaLivroActionPerformed(evt);
            }
        });

        btnDevolveLivro.setText("Devolver");
        btnDevolveLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolveLivroActionPerformed(evt);
            }
        });

        jLabel3.setText("Informe sua senha:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDevolveLivro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbSelecionaUsuario, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSelecionaLivro, javax.swing.GroupLayout.Alignment.TRAILING, 0, 260, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(txtSenhaDevolver))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbSelecionaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbSelecionaLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenhaDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDevolveLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDevolveLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolveLivroActionPerformed
        // TODO add your handling code here:
        String nomeUsuario = cbSelecionaUsuario.getSelectedItem().toString();

        // Obter o livro selecionado na caixa de seleções
        String livroSelecionado = (String) cbSelecionaLivro.getSelectedItem();
        // Separar o título e o idioma do livro selecionado
        String[] partesLivro = livroSelecionado.split(" - ");
        String tituloLivro = partesLivro[0];
        String idiomaLivro = partesLivro[1];

        // Encontrar o livro correspondente na lista de livros
        Livro livro = LivroService.encontrarLivro(tituloLivro, idiomaLivro);

        // Verificar se o livro foi encontrado
        if (livro != null) {
            // Obter a senha do usuário
            String senha = new String(txtSenhaDevolver.getPassword());

            // Chamar o método de devolução de livro
            boolean devolucaoSucesso = EmprestimoService.devolverLivro(nomeUsuario, livro, senha);

            if (devolucaoSucesso) {
                // Atualizar a interface ou fornecer feedback adicional ao usuário, se necessário
                JOptionPane.showMessageDialog(null, "Livro devolvido com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                // Atualizar os ComboBox após a devolução do livro
                carregarComboBoxUsuarios();
                carregarComboBoxLivros();
            } else {
                JOptionPane.showMessageDialog(null, "Falha ao devolver o livro. Verifique a senha e tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Livro não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDevolveLivroActionPerformed

    private void cbSelecionaLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSelecionaLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSelecionaLivroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmDevolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDevolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDevolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDevolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDevolver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDevolveLivro;
    private javax.swing.JComboBox<String> cbSelecionaLivro;
    private javax.swing.JComboBox<String> cbSelecionaUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPasswordField txtSenhaDevolver;
    // End of variables declaration//GEN-END:variables
}
