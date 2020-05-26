package bilgiyakalayici0.pkg1;
/*gif frame icon classı
kaynak:https://stackoverflow.com/questions/10002610/how-use-animated-gif-as-jframe-title-bar-icon
*/
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.JFrame;

public class IconAnimator
{

JFrame           frame = null;
ArrayList<Image> images;
long             msBetweenImages;

public IconAnimator(JFrame frame, ArrayList<Image> images, int msBetweenImages)
{
    this.frame = frame;
    this.images = images;
    this.msBetweenImages = msBetweenImages;
}

public void run()
{
    while(true)
    {
        for(Image image : images)
        {
            try
            {
                frame.setIconImage(image);

                Thread.sleep(msBetweenImages);

            } catch(InterruptedException e)
            {
                e.printStackTrace();
            }

            if(frame == null)
            {
                return;
            }
        }
    }
}
} 