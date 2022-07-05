/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package webscrapping;

import com.opencsv.CSVWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebScrappingFrame extends javax.swing.JFrame {
    public WebScrappingFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        scrap = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        minstory = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        maxstory = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        storyNumber = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        maxS = new javax.swing.JButton();
        minS = new javax.swing.JButton();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("WEB SCRAPPING");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Enter Url");

        scrap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        scrap.setText("Scrap");
        scrap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scrapActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Unique Words");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Total Words");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(jTextField3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(50, 50, 50))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 33, Short.MAX_VALUE))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Most frequent words");

        minstory.setColumns(20);
        minstory.setRows(5);
        jScrollPane3.setViewportView(minstory);

        maxstory.setColumns(20);
        maxstory.setRows(5);
        jScrollPane4.setViewportView(maxstory);

        storyNumber.setColumns(20);
        storyNumber.setRows(5);
        jScrollPane5.setViewportView(storyNumber);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Stories in every Catagory");

        maxS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        maxS.setText("Max Story");
        maxS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxSActionPerformed(evt);
            }
        });

        minS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        minS.setText("Min Story");
        minS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(maxS))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(minS)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel10))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(scrap))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jLabel1)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrap))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(maxS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(minS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jLabel8)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    List<String> catagories = new ArrayList<>();
    ArrayList<String> story = new ArrayList<>();
    ArrayList<String> storyTitle = new ArrayList<>();
    List<String> catagory = new ArrayList<>();

    String url = "https://www.bbc.com/urdu";
    int numberOfWords = 0;
    int numberOfUniqueWords = 0;

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField1ActionPerformed
    public void showLink(Elements link) throws Exception {

        System.out.println("SHOW LINK");
        for (Element links : link) {
            //  System.out.println(links.text());
            catagory.add(links.text()+"");
            catagories.add(links.attr("href"));
        }
        int storyCount = 1;
        int count = 0;
        String filePath = "StoryFile.csv";
        File file = new File(filePath);
        FileWriter outputfile = new FileWriter(file);
        CSVWriter writer = new CSVWriter(outputfile);

        FileWriter storyFile = new FileWriter("StoryFile.csv", true);
        storyFile.write("CATAGORY\tSTORY NUMBER\tTITLE\tSTORY\t\n");

        Set<String> words = new HashSet<String>();
        for (int i = 1; i < catagories.size(); i++) {
            if (count == 600) {
                        return;
            }
            int pageNumber = 1;
            String page;
            storyCount = 0;
            String s = "https://www.bbc.com/" + catagories.get(i);

            //System.out.println(s + "                   size" + story.size());
            while (storyCount < 100) {
                if (storyCount == 100) {
                    break;
                }
                if (count == 600) {
                        return;
                }
                page = s + "?page=" + pageNumber;
                //System.out.println("\n\n\n\n\n" + page + "\n\n\n\n\n\n");

                Document tempDoc = Jsoup.connect(page).get();
                //System.out.println("\nTitle of Catagory is = " + tempDoc.title());
                Element orderList = tempDoc.select("main").not("header").not("footer").select("div").select("ul").first();
                String cat = tempDoc.title();
                // System.out.println("Cat                 " + cat.substring(0, 7));
                Elements stories = orderList.getElementsByTag("a");
                //System.out.println(stories);
                for (Element st : stories) {

                    // System.out.print("\n\nStory Number = (" + (story.size() % 25) + ") LINK:  ");
                    String href = st.attr("href");

                    //System.out.print(href);
                    Document StoryDoc = Jsoup.connect(href).get();
                    //System.out.println("\nTitle of story  =  " + StoryDoc.title() + "\n");
                    Elements para = StoryDoc.select("main").not("header").not("footer").select("p");
                    String stor = para.text();
                    story.add(stor);
                    String[] storyWords = stor.split(" ");
                    for (int j = 0; j < storyWords.length; j++) {
                        words.add(storyWords[j]);
                        //  System.out.print(storyWords[j] + " ");
                    }
                    numberOfUniqueWords += words.size();

                    numberOfWords += storyWords.length;
                    //System.out.println("\n\n\n\nstorySize "+storyWords.length + " \n\n\n\n\n\nsetSIZE"+words.size());
                    storyTitle.add(StoryDoc.title());
                    storyCount++;
                    count++;

                    System.out.println("\n\n\nSize           " + count + "         ");

                    if (para.text() != null) {
                        storyFile.write(tempDoc.attr("data-original-title") + "," + storyCount + "," + StoryDoc.title() + "," + para.text() + "\n");

                    }

                    System.out.println(numberOfWords);
                    if (storyCount == 100) {
                        break;
                    }
                    if (count == 600) {
                        return;
                    }
                }

                pageNumber++;

                //System.out.println(pageNumber + "                                " + story.size());
            }

        }//end of for loop
        //writer.close();

        storyFile.close();
    }

    void showFrequentWords() {
        String storyy = "";
        for (int i = 0; i < story.size(); i++) {
            storyy = storyy + " " + story.get(i);

        }
        String[] words = storyy.split("\\s+");
        int finalCount = 0;
        int tempCount = 0;
        int[] count = new int[words.length];
        String mostlyUsedWord = null;
        int ind = 0;
        for (String word : words) {
            tempCount = 0;
            for (String w : words) {
                if (word.equalsIgnoreCase(w)) {
                    tempCount++;
                }
            }
            System.out.println(ind+"");
            if(ind==1000)
                break;
            count[ind++] = tempCount;
        }
        List<String> res = new ArrayList<>();
        res = topKFrequent(words, 10);
        for (int i = 0; i < res.size(); i++) {
            jTextArea1.append(res.get(i) + "\n");
        }

    }

    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        List<String> res = new ArrayList<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

//         MinHeap
        PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {

            public int compare(String o1, String o2) {
                int freq1 = map.get(o1);
                int freq2 = map.get(o2);

                // To check in alphabetical order
                if (freq1 == freq2) {
                    return o2.compareTo(o1);
                }
                return freq1 - freq2;

            }
        });

        // To add in PriorityQueue<K>
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            pq.add(entry.getKey());
            if (pq.size() > k) {
                pq.poll();
            }
        }

        //Adding into List(res)
        while (!pq.isEmpty()) {
            res.add(pq.poll());
        }

        Collections.reverse(res);
        return res;
    }
    private void scrapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scrapActionPerformed
        // TODO add your handling code here:
        String url = jTextField1.getText();

        try {
            Document doc = Jsoup.connect(url).get();
            //System.out.println(doc.title());
            Elements ul = doc.getElementsByTag("ul");
            Element e = ul.first();

            Elements links = e.getElementsByTag("a");
//            for (Element s : links) {
//                System.out.println("Links: " + s.attr("href"));
//            }

            showLink(links);
            for(int i=0;i<catagory.size();i++){
                storyNumber.setText(catagory.get(i)+" 100\n");
            }
            jTextField2.setText(numberOfWords + "");
            jTextField3.setText(numberOfUniqueWords + "");
            showFrequentWords();

        } catch (Exception ioe) {
            ioe.printStackTrace();
        }
    }//GEN-LAST:event_scrapActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void maxSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxSActionPerformed
        // TODO add your handling code here:
        int largestString = story.get(0).length();
        int index = 0;

        for(int i = 0; i < story.size(); i++)
        {
            if(story.get(i).length() > largestString)
            {
                largestString = story.get(i).length();
                                index = i;
            }
        }
        maxstory.setText(story.get(index));
//        String max = Collections.max(story);
//        maxstory.setText(max);
    }//GEN-LAST:event_maxSActionPerformed

    private void minSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minSActionPerformed
        // TODO add your handling code here:
        String min = Collections.min(story);
        minstory.setText(min);
    }//GEN-LAST:event_minSActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WebScrappingFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton maxS;
    private javax.swing.JTextArea maxstory;
    private javax.swing.JButton minS;
    private javax.swing.JTextArea minstory;
    private javax.swing.JButton scrap;
    private javax.swing.JTextArea storyNumber;
    // End of variables declaration//GEN-END:variables
}
