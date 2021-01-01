import java.awt.*;
import javax.swing.*;

public class tqNotes extends JFrame {
    
    private JTextArea textArea;
    private JLabel pikaThanks;
    
    public tqNotes(String name) {
        pikaThanks = new JLabel();
        ImageIcon pikaThumbs = new ImageIcon(new ImageIcon("pikaThumbs.png").getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_DEFAULT));
        pikaThanks.setIcon(pikaThumbs);
        pikaThanks.setText("Thanks for sticking through my program!!!");
        pikaThanks.setFont(new Font("MV Boli", Font.BOLD, 15));
        pikaThanks.setHorizontalTextPosition(JLabel.CENTER);
        pikaThanks.setVerticalTextPosition(JLabel.BOTTOM);
        pikaThanks.setForeground(new Color(179, 179, 179));
        
        textArea = new JTextArea();
        if (name.equals("eric")) {
            eric(textArea);
        } else if (name.equals("chandan")) {
            chandan(textArea);
        } else if (name.equals("randair")) {
            randair(textArea);
        } else if (name.equals("megan")) {
            megan(textArea);
        } else if (name.equals("soham")) {
            soham(textArea);
        }

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(400, 200));
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.getContentPane().setBackground(new Color(28, 28, 28));
        this.setIconImage(new ImageIcon("tqIcon.png").getImage());
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.add(scrollPane);
        this.add(pikaThanks);
    }

    private void eric(JTextArea textArea) {
        textArea.setText("Dear Eric,\n\n"
                        + "Thank you so much for your incredible work in Section XA!! "
                        + "I had an incredibly fun time spending time during the quiz sections + office hours,"
                        + " although I may have joke around too much ^.^ (sometimes overdoing it). I "
                        + "genuinely felt like our Section XA had formed a community together. "
                        + "I was able to grasp a lot of materials covered in this course thanks to you"
                        + ", especially when it came to the second half of the material (those diagrams came in clutch!!!)."
                        + " Overall, on behalf of the XA community I just wanted to thank you for the hard"
                        + " work you put in, and the time you took to put everything together and help us learn the material."
                        + " Thank you for letting us have such a joyful and amazing quarter!!!!!\n\n"
                        + "- Grant Tannert\n"
                        + "P.S. I am looking forward to our future pizza party :) BEST SECTION THERE EVER IS!!!\n"
                        + "Extra: You inspired me to switch to Linux :)\n\n"
                        + "===================================================\n\n"
                        + "Dear Eric,\n\n"
                        + "Thanks for TA-ing for XA fall quarter! You did a great job and I loved the class! I really enjoyed "
                        + "our quiz sections because you taught us the concepts and got us interested in the material, too."
                        + " Your Aww whiteboard sketches were very helpful and helped me get out of a rut on concepts"
                        + " more times than I'd like to admit. Don't tell the TA's in my other classes but you were my favorite one.\n\n"
                        + "- David Strupinski\n"
                        + "P.S. Can't wait for the pizza party next year when we can see each other in person!\n\n"
                        + "===================================================\n\n"
                        + "Dear Eric,\n\n"
                        + "Thank you so much for helping me through CSE 143x. I really appreciate that you answered all my questions "
                        + "about where I went wrong in the homework assignments thoroughly and patiently, as"
                        + " well as clearing my doubts during section time. It was very helpful and a lot of fun!\n\n"
                        + "- Kshitij Gupta\n\n"
                        + "===================================================\n\n"
                        + "Eric,\n\n"
                        + "I just want to say I really appreciate all the hard work and effort you've put in this quarter "
                        + "and you've definitely made 143X easier and enjoyable for everyone in our quiz section. Also, I "
                        + "don't want to compare or anything but we were definitely the best section. Now that you've "
                        + "set the standards for TAing so high, I'm ready to be disappointed by my future TAs. Hope you "
                        + "have a great 2021!\n\n"
                        + "- Gary Guo"
                        );
        setText(textArea);
    }

    private void setText(JTextArea textArea) {
        textArea.setCaretPosition(0);
        textArea.setBounds(50, 50, 400, 200);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(new Color(40, 40, 40));
        textArea.setBorder(BorderFactory.createBevelBorder(1));
        textArea.setForeground(new Color(179, 179, 179));
        textArea.setFont(new Font("Comic Sans", Font.ITALIC, 12));
        textArea.setEditable(false);
    }

    private void chandan(JTextArea textArea) {
        textArea.setText("Dear Chandan,\n\n"
                        + "Even though I wasn't in your section, I had been to a couple of your office hours, "
                        + "and it has definitely helped me out through this class. There were times where I would "
                        + "be confused and you have helped me grasp a basic understanding of how it works. I don't have"
                        + " much to say so I have reached out to some people from your section to write some thank you notes!\n\n"
                        + "- Grant Tannert\n\n"
                        + "===================================================\n\n"
                        + "Hey Chandan,\n\n"
                        + "Thanks for teaching XC this quarter! I felt that you were able to explain a lot of confusing concepts"
                        + " in 143x pretty well, sometimes better than Stuart did (nothing against him, great guy)."
                        + " I honestly enjoyed going to section, although it would've definitely been better working with"
                        + " people in person. Good luck with classes next quarter and I hope you'll be able to TA again!\n\n"
                        + "- Jerry Liu\n\n"
                        + "===================================================\n\n"
                        + "Dear Chandan,\n\n"
                        + "First of all, thank you for an amazing first quarter at UW. This quarter was something none"
                        + " of us were expecting, and had absolutely no idea about the kind of academic challenges we "
                        + "would face, but for the CSE class, I have no clue how I could have gotten through without all the help"
                        + " and support from you!\n"
                        + "You did a fantastic job of clearing all the concepts from the video lectures for us, you offered "
                        + "great advice for homework, and I am extremely grateful to you for that.\n"
                        + "I just want to thank you for all the hard work you put in to help your students succeed, and I "
                        + "sincerely hope we meet soon!\n\n"
                        + "- Arjun Jagnani\n\n"
                        + "===================================================\n\n"
                        + "Dear Chandan,\n\n"
                        + "Thank you for putting a lot of work and effort in teaching us this past quarter. The class as a "
                        + "whole was fun and interesting. Section contests was close but we got to there only because of "
                        + "your support and guidance. Hope to work with you later on campus. Thank you!\n\n"
                        + "-Jainish Malhotra"
                        );
        setText(textArea);
    }

    private void randair(JTextArea textArea) {
        textArea.setText("Dear RanDair,\n\n"
                        + "Thank you for teaching my 143X quiz section this quarter! I always had a great time during"
                        + " our sections together and felt like all our classmates built a bond over the course of the quarter."
                        + " I appreciate you for taking the time to stay after your section ends to chat with me and answer any questions I had."
                        + " I was able to develop myself as a person while learning the materials I didn't have a chance to cover in Running Start, especially "
                        + "when it came to the second half of the quarter. Thank you for everything Randair.\n\n"
                        + "- Efrain Moreno Lona\n"
                        + "P.S. I hope to see you in person at the pizza party!"
                        );
        setText(textArea);
    }

    private void soham(JTextArea textArea) {
        textArea.setText("Dear Soham,\n\n"
                        + "Thank you so much for everything you have done!! I know I'm not in your section, but I probably"
                        + " spent the most time in your office hours ^_^ lol (actually I might have attended all of them). You have really helped me out with understanding"
                        + " a lot of concepts in the CSE 143x material, and always seem to be active everytime on the message board."
                        + " I know there are times when I have too much questions, or maybe even asking questions that I probably know."
                        + "I apologize for that :) but anyways you have really helped me develop a way to question myself and figure out"
                        + " how to do these things on my own. I enjoyed our time we spent during those friday office hours and thanks for"
                        + " helping me have such a wonderful experience this quarter.\n\n"
                        + "- Grant Tannert\n"
                        + "P.S. I wasn't able to find other students in your section :(, which is why this is the only note."
                        + " But I hope you still enjoyed the program!!"
        );
        setText(textArea);
    }

    private void megan(JTextArea textArea) {
        textArea.setText("Dear Megan,\n\n"
                        + "Hi! Thanks so much for the work you have put in, I am truly extremely grateful for everything you've done."
                        + "I am aware that I am not in your section and that you aren't my TA, but you have really helped me out in those office hours."
                        + " You have helped me out a lot in developing a student's perspective in approaching things, a step by step approach. Also you inspired me to"
                        + " draw out my confusions in problem solving. Thank you for letting me hop on your quiz sections occasionally whenever I overslept and missed mine "
                        + "lol (^^;) This have been such an eventful quarter despite the pandemic and you have helped me enjoy it!! Thanks once again!\n\n"
                        + "- Grant Tannert\n"
                        + "P.S. I wasn't able to find any other students in your section since it violates the rules, thus this is probably the only note."
                        + " Anyways, hope you still enjoyed the program!!\n"
                        + "Extra: I also hope we can still continue to game :)"
                        );
        setText(textArea);
    }
}
