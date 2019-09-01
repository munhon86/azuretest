package practice;

/**
 * Created by HP on 8/8/2016.
 */
public class NewPractice
{
    static void changeMessage(Message message) {
        message.setContent("Yo");
    }

    public static void main(String[] args )
    {

        mGreetButton = new Button();

        // Trigger button click
        buttonClicked(mGreetButton);
    }
}


class Message {

    private String mSender;
    private String mContent;

    public Message(String content) {
        mContent = content;
    }

    public void setContent(String content) {
        mContent = content;
    }

    public String getContent() {
        return mContent;
    }

    public void setSender(String sender) {
        mSender = sender;
    }

    public String getSender() {
        return mSender;
    }




}

class Button
{

}

class MainActivity {

    static final String TAG = "MainActivity";

    Button mGreetButton = new Button();


    private void buttonClicked(Button button) {
        if (button == mGreetButton) {
            System.out.println("Greet button clicked");
        }
    }
}




