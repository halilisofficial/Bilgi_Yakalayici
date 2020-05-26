
package bilgiyakalayici0.pkg1;

import java.awt.EventQueue;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class BilgiYakalayici01 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        /*
        gif frame icon oluştumak için eklenmiştir
        */
             ImageIcon ic;
          ArrayList<Image> img = new ArrayList<Image>();
          for(byte i = 1; i<45; i++)
          {
              ic= new ImageIcon("src\\bilgiyakalayici0\\pkg1\\Dunyalar\\m ("+i+").png");
          img.add(ic.getImage());
          }
          
                   
    EventQueue.invokeLater(new Runnable()
    {
        public void run()
        {
            try
            {
                frame.setVisible(true);
            } catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    });

    IconAnimator animator = new IconAnimator(frame, img, 250);
    animator.run();
          
        
        
    }
    
}
