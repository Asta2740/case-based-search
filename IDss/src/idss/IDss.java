
package idss;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.util.Arrays;
import javax.swing.*;


//@YH 
public class IDss implements ActionListener {
    // adding the frame Variables 
    String Firstname ,Secondname;
    JList<String>  TList;
    JTable table;
    JFrame frame;
    JPanel panel;
    JPanel Rpanel;
    JPanel PB;
    JPanel BLabel;
    JPanel BLabel2;
    JButton Rbutton , Rbutton2;
    JLabel BigLabel;
    JLabel label;
    JTextArea t1;
    JButton button, button2;
    // till here
    //then adding the arrays of our project the 2d arrays we makin
    String[][] name= new String[10][3];
    //this for saving the result when we get a match down there
    String[] Saver = new String[2];
    /* that's a boolean acting like a light
    switch so when we get a match it get lit up
    */
    boolean Checker = false;
    /* this int for summing how many words from user inputs are the same words
    from our database */
    int cal=0;
    /* array strong to store the split up strings from the user input and the
    symptomps we checking 
    ( T2 for the user inputs ) (T3 for the database we got)
    */
    String[] T2;
    String[] T3;
    String[] T4;
    float TFT;
    DefaultListModel<String> l1;
    IDss(){
        //@YH
        // Our database
    name[0][0]="A sudden, severe headache"
            + "Impaired vision inability to control the eyes"
            + "Inability to move."
            + "numbness in the extremities"
            + "Fatigue and vomiting";
    name[0][1]="Brain attack."; 
    name[0][2]="1-Motor skill exercises: These exercises help strengthen and coordinate muscles.   "
            + "2-Motor training: the patient learns to use mobility aids, such as a walker or a wheelchair.   "
            + "3-Treatment using restraints: the healthy limb is restrained, and the affected limb is moved to strengthen its motor function.   "
            + "4-Range-of-motion therapy: This is done through some specialized exercises that help the patient restore the entire range of motion of the affected part.   ";
    name[1][0]="trembling in hands arms legs jaw head"
            + "Slowness of movement"
            + "Stiffness of the limbs and trunk"
            + "Impaired balance and coordination";
    name[1][1]="Parkinson's disease"; 
    name[1][2]="1-Walking and balance training.   "
            + "2-Resistance exercises.   "
            + "3-Regular exercise.   ";
    name[2][0]="Tingling, especially at night"
            + "Numbness of the fingers "
            + "feeling pain"
            + "Muscle atrophy in the thumb area";
    name[2][1]="carpal tunnel syndrome"; 
    name[2][2]="1-Apply cold compresses to the affected area, or soak the hand in a cool bath to reduce swelling   "
            + "2-Putting the hands in a bowl of warm water, then stretching or clenching the hand several times   "
            + "3-Exercising the hands by making circular motions or extending the fingers and palms of the hands   "
            + "4-Reducing excess weight   ";
    name[3][0]="loss of mobility"
            + "Loss of sensation"
            + "Loss of control over urination"
            + "Muscle tone"
            + "Poor sexual performance and fertility";
    name[3][1]="Spinal cord injuries"; 
    name[3][2]="1-joint movement   "
            + "2-Stretching exercises   "
            + "3-Aerobic exercise   "
            + "4-Muscle strengthening exercises   "
            + "5-Functional Electrical Stimulation Device   ";
    name[4][0]="Short stature"
            + "Delayed tooth development"
            + "delayed sexual maturation"
            + "High fat mass"
            + "A sharp decrease in muscle mass"
            + "Low cardiac output"
            + "Decreased muscle mass"
            + "Exhaustion";
    name[4][1]="Delayed growth"; 
    name[4][2]="1-Acquisition of lost motor skills such as sitting or walking through manual exercises   ";
    name[5][0]="trouble walking"
            + "Loss of reflexes"
            + "difficulty standing"
            + "Mild mental retardation"
            + "breathing difficulties"
            + "problems swallowing"
            + "Lung and heart weakness";
    name[5][1]="Muscular dystrophies";
    name[5][2]="1-Stretching exercises and improving the range of motion of the limbs to increase flexibility   "
            + "2-Low-impact exercises to maintain muscle strength and mobility in full body physical therapy sessions   "
            + "3-Instructions for stretching muscles and tendons with their respective braces   "
            + "4-Improving body posture and a person's ability to stand, lie down and sit   ";
    name[6][0]="repeat the same sentences and words"
            + "forget conversations or appointments"
            + "put things in the wrong place, and in places that don't make sense at all"
            + "Thinking problems"
            + "Impaired ability to read and write"
            + "forget the names of their family members, and the names of things they use every day";
    name[6][1]="Alzheimer"; 
    name[6][2]="Studies have proven that physical exercise "
            + "is very beneficial for Alzheimer's patients. It maintains cardiovascular "
            + "activity and increases patient endurance and strength."
            + " It also helps to maintain his motor skills, reduces the risk of falling"
            + " to the ground, and reduces the percentage of diseases associated with a"
            + " cognitive decline. "
            + "It helps in improving his behaviour, memory and communication skills."; 
    name[7][0]="Back pain and may be severe pain in the event of a crack or collapse in the vertebrae"
            + "Weight loss over time with curvature of stature"
            + "Fractures in the vertebrae, in the joints of the palms of the hands, in the pelvis of the thighs or in other bones";
    name[7][1]="Osteoporosis"; 
    name[7][2]="1-Cut back on caffeine and sugars   "
            + "2-do acupuncture   "
            + "3-sun exposure   "
            + "4-Use of essential oils   "
            + "5-Doing tai chi   "
            + "6-Maintaining physical activity   "
            + "7-herbs   ";
    name[8][0]="back pain that may extend to the legs and feet in some cases";
    name[8][1]="Back pain"; 
    name[8][2]="1-With lumbar traction, the patient lies on his back and is fixed on a special table, which is one of the physiotherapy devices for the back vertebrae   "
            + "2-Tighten your hamstring muscles once or twice daily  15-20 minutes of dynamic lumbar stabilization or other exercises should be performed   "
            + "3-Stand with legs straight and shoulder width apart, with a broom stick or heavy bar on the shoulders. Then the patient slowly bends forward until the face is parallel to the ground and then rises again   ";
    name[9][0]="Sudden, sharp pain at the site of the tear"
            + "burning feeling"
            + "Inability to move the muscle or limited movement"
            + "Bruising or change in skin color"
            + "swelling and puffiness"
            + "muscle spasms"
            + "muscle stiffness"
            + "weakness";
    name[9][1]="muscle rupture"; 
    name[9][2]="1-rest and relax   "
            + "2-Applying ice packs   "
            + "3-Lifting the injured muscle   ";
        // our gui frame and buttons
         frame = new JFrame("Check your illness"); 
         TList = new JList();
         l1 = new DefaultListModel<>();
         TList= new JList<>(l1);
         TList.setBounds(100,100, 75,75);
         panel = new JPanel();
         button = new JButton();
         Rbutton = new JButton("Redo");
         Rbutton2 = new JButton("Exit");
         button2 = new JButton("Exit");
        button.setText("Check"); 
        label = new JLabel();
        Rpanel = new JPanel();
        PB = new JPanel();
        BLabel = new JPanel();
        BLabel2 = new JPanel();
        BigLabel = new JLabel("Describe your symptoms please");
        BLabel.add(BigLabel);
        //@YH
        PB.add(button);
        PB.add(button2);
        Rpanel.add(label);
        Rpanel.add(TList);
        BLabel2.add(Rbutton);
        BLabel2.add(Rbutton2);
        
        t1=new JTextArea();
        t1.setBounds(10,30, 200,200);
        t1.setLineWrap(true);
       
        panel.add(t1);
        frame.add(BLabel,BorderLayout.NORTH);
        frame.add(PB,BorderLayout.SOUTH);
        frame.add(t1,BorderLayout.CENTER);  
        frame.setSize(400, 200);  
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);
        // action listenr for the buttons
        button.addActionListener(this);
        button2.addActionListener(this);
        Rbutton.addActionListener(this);
        Rbutton2.addActionListener(this);
        
        
    }
//@YH
    @Override
    public void actionPerformed(ActionEvent e) {
        // now for the main functions  First button the Check button
        /*first we make an ifs we can make 
        them through switchs too but i prefer ifs */
        if(t1.getText() != null &&!t1.getText().equals("")){
        if(e.getSource()==button){
            /*first when a person write down his illness and press check 
what happen is we use the T2 Storage to split up his whole setntence into words
and we check each word if it exists in the database of our first name[i][0]
it checks by function ( Contains ) if it contains that word it addes to the 
counter  variable (cal)
            */
           
       T2 = t1.getText().split(" ");
       for(int i=0;i<name.length;i++){
               cal=0;
//we split the name[i][0] into T3 so we can count how many words are they 

               T3 = name[i][0].split(" ");
               
               
               
/* we use store the number of words and we see how much % we want the user
   input to match the ( we currently have it at 60% (0.6 of the length)
*/
               TFT =(float) (T3.length*0.1);
           for(int j=0;j<T2.length;j++){
               // if the words exists it adds a 1 to the cal variable
               if(name[i][0].contains(T2[j])){
                   cal++;
               }
/* if cal became more than the TFT or equal like it has 60% or more 
  then we use our saver array we mentioned eariler to record the 
  dieases name and what the procedure or what the name of the mediedince to be
  taken
               */
               if(cal>=TFT){
                    for(int m=0;m<Saver.length;m++){
                   int k =m+1;
                   Saver[m]=name[i][k];
                   
               }
             // break the loop if we found a match and flip the checker switch
                    Checker = true;
                    break;
           }
            }
        if(Checker==true){
            for(int j=0;j<Saver.length;j++){
                if(j==0){Firstname =Saver[j];}
                else if(j==1){
               T4 = Saver[j].split("   ");
               
                }
            }
// now we put the names into a label and we remove all the panal stuff the texting
// and using the function repaint to put a new panal (Rpanel) which has the label
       for(int L =0; L<T4.length;L++){
        l1.addElement(T4[L]); 
             }
        label.setText(Firstname);
        frame.getContentPane().removeAll();
        frame.add(Rpanel,BorderLayout.NORTH);
        frame.add(TList,BorderLayout.CENTER);
        frame.add(BLabel2,BorderLayout.SOUTH);
        frame.pack();  
        frame.repaint();
        frame.setLocationRelativeTo(null); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);
        break;
//@YH
        }
        else{
        label.setText("Sorry your illness wasn't found");
        frame.getContentPane().removeAll();
        frame.add(Rpanel,BorderLayout.CENTER);
        frame.add(BLabel2,BorderLayout.SOUTH);
        frame.setSize(400, 200);  
        frame.repaint();
        frame.setLocationRelativeTo(null); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);
        }
       //@YH
        }
        }
        }
        // exit buttons 
        if(e.getSource()==button2 || e.getSource()==Rbutton2){
            frame.dispose();
        }
        // if we click redo it removes the Rpanel and brings back the Text Panel
        if(e.getSource()==Rbutton){
        l1.clear();
        t1.setText("");
        Checker =false;
        frame.getContentPane().removeAll();
        frame.add(BLabel,BorderLayout.NORTH);
        frame.add(PB,BorderLayout.SOUTH);
        frame.add(t1,BorderLayout.CENTER);
        frame.setSize(400, 200);  
        frame.repaint();
        frame.setLocationRelativeTo(null); 
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);
            
        }
        
        
    }
    
    
    

      public static void main(String[] args) {
        new IDss();
    }
    
}
