/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * BulkUploader.java
 *
 * Created on Jul 12, 2010, 10:39:51 PM
 */
package com.jctn.bulkupload;

import com.jctn.bulkupload.controller.BulkUploaderController;

/**
 *
 * @author martin
 */
public class BulkUploader extends javax.swing.JFrame {

	private BulkUploaderController guiController;

	/** Creates new form BulkUploader */
	public BulkUploader() {
		initComponents();
		setLocationRelativeTo(null);
		guiController = new BulkUploaderController();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        csvFileChooser = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        textFieldUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textFieldDomain = new javax.swing.JTextField();
        uploadButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        chooseFileButton = new javax.swing.JButton();
        textFieldCsvFilePath = new javax.swing.JTextField();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        csvFileChooser.setCurrentDirectory(new java.io.File("C:\\"));
            org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(com.jctn.bulkupload.DesktopApplication1.class).getContext().getResourceMap(BulkUploader.class);
            csvFileChooser.setDialogTitle(resourceMap.getString("csvFileChooser.dialogTitle")); // NOI18N
            csvFileChooser.setName("csvFileChooser"); // NOI18N
            csvFileChooser.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    csvFileChooserActionPerformed(evt);
                }
            });

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setMinimumSize(new java.awt.Dimension(300, 150));
            setName("Form"); // NOI18N
            getContentPane().setLayout(new java.awt.GridBagLayout());

            jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
            jLabel1.setName("jLabel1"); // NOI18N
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.ipadx = 2;
            gridBagConstraints.ipady = 1;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
            gridBagConstraints.insets = new java.awt.Insets(4, 0, 1, 5);
            getContentPane().add(jLabel1, gridBagConstraints);

            textFieldUsername.setText(resourceMap.getString("textFieldUsername.text")); // NOI18N
            textFieldUsername.setName("textFieldUsername"); // NOI18N
            textFieldUsername.setPreferredSize(new java.awt.Dimension(100, 20));
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.ipadx = 2;
            gridBagConstraints.ipady = 1;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
            gridBagConstraints.insets = new java.awt.Insets(4, 0, 1, 5);
            getContentPane().add(textFieldUsername, gridBagConstraints);

            jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
            jLabel2.setName("jLabel2"); // NOI18N
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 1;
            gridBagConstraints.ipadx = 2;
            gridBagConstraints.ipady = 1;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
            gridBagConstraints.insets = new java.awt.Insets(4, 0, 1, 5);
            getContentPane().add(jLabel2, gridBagConstraints);

            jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
            jLabel3.setName("jLabel3"); // NOI18N
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 2;
            gridBagConstraints.ipadx = 2;
            gridBagConstraints.ipady = 1;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
            gridBagConstraints.insets = new java.awt.Insets(4, 0, 1, 5);
            getContentPane().add(jLabel3, gridBagConstraints);

            textFieldDomain.setText(resourceMap.getString("textFieldDomain.text")); // NOI18N
            textFieldDomain.setName("textFieldDomain"); // NOI18N
            textFieldDomain.setPreferredSize(new java.awt.Dimension(100, 20));
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 2;
            gridBagConstraints.ipadx = 2;
            gridBagConstraints.ipady = 1;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
            gridBagConstraints.insets = new java.awt.Insets(4, 0, 1, 5);
            getContentPane().add(textFieldDomain, gridBagConstraints);

            uploadButton.setText(resourceMap.getString("uploadButton.text")); // NOI18N
            uploadButton.setName("uploadButton"); // NOI18N
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 2;
            gridBagConstraints.gridy = 3;
            gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
            getContentPane().add(uploadButton, gridBagConstraints);

            passwordField.setText(resourceMap.getString("passwordField.text")); // NOI18N
            passwordField.setName("passwordField"); // NOI18N
            passwordField.setPreferredSize(new java.awt.Dimension(100, 20));
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 1;
            gridBagConstraints.ipadx = 2;
            gridBagConstraints.ipady = 1;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
            gridBagConstraints.insets = new java.awt.Insets(4, 0, 1, 5);
            getContentPane().add(passwordField, gridBagConstraints);

            chooseFileButton.setText(resourceMap.getString("chooseFileButton.text")); // NOI18N
            chooseFileButton.setName("chooseFileButton"); // NOI18N
            chooseFileButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    chooseFileButtonActionPerformed(evt);
                }
            });
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 3;
            gridBagConstraints.ipadx = 2;
            gridBagConstraints.ipady = 1;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
            gridBagConstraints.insets = new java.awt.Insets(20, 9, 1, 5);
            getContentPane().add(chooseFileButton, gridBagConstraints);

            textFieldCsvFilePath.setText(resourceMap.getString("textFieldCsvFilePath.text")); // NOI18N
            textFieldCsvFilePath.setName("textFieldCsvFilePath"); // NOI18N
            textFieldCsvFilePath.setPreferredSize(new java.awt.Dimension(125, 20));
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 3;
            gridBagConstraints.ipadx = 2;
            gridBagConstraints.ipady = 1;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
            gridBagConstraints.insets = new java.awt.Insets(20, 0, 1, 5);
            getContentPane().add(textFieldCsvFilePath, gridBagConstraints);

            menuBar.setName("menuBar"); // NOI18N

            fileMenu.setText(resourceMap.getString("fileMenu.text")); // NOI18N
            fileMenu.setName("fileMenu"); // NOI18N

            openMenuItem.setText(resourceMap.getString("openMenuItem.text")); // NOI18N
            openMenuItem.setName("openMenuItem"); // NOI18N
            fileMenu.add(openMenuItem);

            saveMenuItem.setText(resourceMap.getString("saveMenuItem.text")); // NOI18N
            saveMenuItem.setName("saveMenuItem"); // NOI18N
            fileMenu.add(saveMenuItem);

            saveAsMenuItem.setText(resourceMap.getString("saveAsMenuItem.text")); // NOI18N
            saveAsMenuItem.setName("saveAsMenuItem"); // NOI18N
            fileMenu.add(saveAsMenuItem);

            exitMenuItem.setText(resourceMap.getString("exitMenuItem.text")); // NOI18N
            exitMenuItem.setName("exitMenuItem"); // NOI18N
            exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    exitMenuItemActionPerformed(evt);
                }
            });
            fileMenu.add(exitMenuItem);

            menuBar.add(fileMenu);

            editMenu.setText(resourceMap.getString("editMenu.text")); // NOI18N
            editMenu.setName("editMenu"); // NOI18N

            cutMenuItem.setText(resourceMap.getString("cutMenuItem.text")); // NOI18N
            cutMenuItem.setName("cutMenuItem"); // NOI18N
            editMenu.add(cutMenuItem);

            copyMenuItem.setText(resourceMap.getString("copyMenuItem.text")); // NOI18N
            copyMenuItem.setName("copyMenuItem"); // NOI18N
            editMenu.add(copyMenuItem);

            pasteMenuItem.setText(resourceMap.getString("pasteMenuItem.text")); // NOI18N
            pasteMenuItem.setName("pasteMenuItem"); // NOI18N
            editMenu.add(pasteMenuItem);

            deleteMenuItem.setText(resourceMap.getString("deleteMenuItem.text")); // NOI18N
            deleteMenuItem.setName("deleteMenuItem"); // NOI18N
            editMenu.add(deleteMenuItem);

            menuBar.add(editMenu);

            helpMenu.setText(resourceMap.getString("helpMenu.text")); // NOI18N
            helpMenu.setName("helpMenu"); // NOI18N

            contentsMenuItem.setText(resourceMap.getString("contentsMenuItem.text")); // NOI18N
            contentsMenuItem.setName("contentsMenuItem"); // NOI18N
            helpMenu.add(contentsMenuItem);

            aboutMenuItem.setText(resourceMap.getString("aboutMenuItem.text")); // NOI18N
            aboutMenuItem.setName("aboutMenuItem"); // NOI18N
            helpMenu.add(aboutMenuItem);

            menuBar.add(helpMenu);

            setJMenuBar(menuBar);

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
		System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

	private void chooseFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseFileButtonActionPerformed
		//load the file chooser
		guiController.loadFileChooser(this, csvFileChooser);
	}//GEN-LAST:event_chooseFileButtonActionPerformed

	private void csvFileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csvFileChooserActionPerformed
		//Populate the text field with the path of the choosen file.
		guiController.runInSwingThread(new Runnable() {

			@Override
			public void run() {
				textFieldCsvFilePath.setText(csvFileChooser.getSelectedFile().getAbsolutePath());
			}
		});
	}//GEN-LAST:event_csvFileChooserActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				new BulkUploader().setVisible(true);
			}
		});
	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton chooseFileButton;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JFileChooser csvFileChooser;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JTextField textFieldCsvFilePath;
    private javax.swing.JTextField textFieldDomain;
    private javax.swing.JTextField textFieldUsername;
    private javax.swing.JButton uploadButton;
    // End of variables declaration//GEN-END:variables
}