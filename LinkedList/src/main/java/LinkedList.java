class Node{
    int data;
    Node next;
    Node(int data){
        this.data= data;
        this.next=null;
    }
}
public class LinkedList extends javax.swing.JFrame {
    Node head, tail;
    public LinkedList() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        input = new javax.swing.JTextField();
        addF = new javax.swing.JButton();
        addL = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        linkedList = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        sN = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        removeN = new javax.swing.JTextField();
        remove = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addF.setText("Add First");
        addF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFActionPerformed(evt);
            }
        });

        addL.setText("Add Last");
        addL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLActionPerformed(evt);
            }
        });

        linkedList.setColumns(20);
        linkedList.setRows(5);
        jScrollPane1.setViewportView(linkedList);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Linked List");

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        remove.setText("Remove");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel2.setText("Remove Number");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setText("ADD Linked List");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(420, 420, 420)
                        .addComponent(sN, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addL)
                                    .addComponent(addF)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(removeN, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(remove))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search))
                .addGap(1, 1, 1)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addF)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(addL)))
                .addGap(68, 68, 68)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(remove))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFActionPerformed
       linkedList.setText("");
        Node newNode= new Node(Integer.parseInt(input.getText()));
        if(isEmpity()){
            head=newNode;
        }
        else{
            newNode.next= head;
            head= newNode;
        }
        input.setText("");
        showLL();
    }//GEN-LAST:event_addFActionPerformed

    private void addLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLActionPerformed
        linkedList.setText("");
        Node newNode= new Node(Integer.parseInt(input.getText()));
        Node cur= head;
        if(isEmpity()){
            head=newNode;
        }
        else{
            while(cur.next!=null){
                cur=cur.next;
            }
            cur.next=newNode;
        }
        input.setText("");
        showLL();
    }//GEN-LAST:event_addLActionPerformed
    void showLL(){
        Node cur=head;
        while(cur.next!=null){
            linkedList.setText(linkedList.getText().concat(cur.data+" "));
            cur=cur.next;
        }
        linkedList.setText(linkedList.getText().concat(cur.data+" "));
    }
    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        Node curt= head;
		boolean f=false;
		while(curt.next!=null){
			if(Integer.parseInt(sN.getText())==curt.data){
				f=true;
				break;
			}		
			curt= curt.next;
		}
		if(curt.data==Integer.parseInt(sN.getText())){
			f=true;
		}
		sN.setText(f+"");
        
    }//GEN-LAST:event_searchActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        linkedList.setText("");
        Node cur=head;
            while(cur.next!=null){
                if(head.data==Integer.parseInt(removeN.getText())){
                   head= cur.next;
                }
		if(cur.next.data==Integer.parseInt(removeN.getText())){
                    cur.next=cur.next.next;
                }		
                cur= cur.next;
            }
        removeN.setText("");
        showLL();
    }//GEN-LAST:event_removeActionPerformed
    boolean isEmpity(){
        return (head==null);
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LinkedList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addF;
    private javax.swing.JButton addL;
    private javax.swing.JTextField input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea linkedList;
    private javax.swing.JButton remove;
    private javax.swing.JTextField removeN;
    private javax.swing.JTextField sN;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}
