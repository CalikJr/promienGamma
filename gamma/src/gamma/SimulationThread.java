package gamma;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Panel;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.jfree.data.statistics.HistogramDataset;

public class SimulationThread implements Runnable{
	private boolean exit;
	static double mi=1, N_0=1;
	static long delay;
	static int iteration;
	static JPanel beam;
	Thread thread;
    public void run(){
    	
    }
    public void stop() {
    	exit = true;
    	System.out.println("thread stop");
    }
  
    SimulationThread(){
    	System.out.println("thread open");
    	thread = new Thread(){
    	public void run() {
    		if(SimulationThread.iteration == 0) {
    			
    			GraphPanel.values1 = new double[1000];
    			}
    	while(!exit) {
    		beam = new JPanel() {
    			 @Override
                 public void paintComponent(Graphics g) {
    				 super.paintComponent(g);
                     Graphics2D g2d = (Graphics2D) g;
                     g2d.drawImage((new ImageIcon("./src/pictures/Gamma_beam.png")).getImage(), AnimationPanel.okno1.getX() , AnimationPanel.okno1.getY(), this);
                     //g2d.fillRect(0, 0, 100, 100);
    			 }
    		};
    		beam.setOpaque(false);
    		beam.setSize(AnimationPanel.Co.getWidth(), 150);
    		beam.setLocation((int)AnimationPanel.okno1.getLocation().getX(), (int) (AnimationPanel.okno1.getLocation().getY()-150+AnimationPanel.okno1.getHeight()));
    		MainPanel.animationpanel.add(beam);
    		AnimationPanel.komora1 = (new ImageIcon("./src/pictures/komora1_inside.png")).getImage();
        	AnimationPanel.komora2 = (new ImageIcon("./src/pictures/komora2_inside.png")).getImage();
        	AnimationPanel.komora3 = (new ImageIcon("./src/pictures/komora3_inside.png")).getImage();
        	MainPanel.animationpanel.revalidate();
        	MainPanel.animationpanel.repaint();
        	if(AnimationPanel.Cs.isChoosen)
				AnimationPanel.Cs.setVisible(true);
			if(AnimationPanel.Co.isChoosen)
				AnimationPanel.Co.setVisible(true);
			if(AnimationPanel.Al.isChoosen)
				AnimationPanel.Al.setVisible(true);
			if(AnimationPanel.Pb.isChoosen)
				AnimationPanel.Pb.setVisible(true);
    	while(iteration<1000) {
	    	TimerTask task = new TimerTask() {
	        public void run() {
	        	GraphPanel.values1[iteration] = 1/mi*Math.log(N_0/AnimationButton.random.nextDouble());
	        	System.out.println(GraphPanel.values1[iteration] + "    " + iteration + "     " + mi);
	        	GraphPanel.dataset1 = new HistogramDataset();
	    		GraphPanel.dataset1.addSeries("key", GraphPanel.values1, 100);
	    		GraphPanel.chart1.getXYPlot().setDataset(GraphPanel.dataset1);
	    		GraphPanel.graphpaint1 = new GraphPaint1();
	    		GraphPanel.graphpaint1.revalidate();
	    		GraphPanel.graphpaint1.repaint();
	    		Main.graphpanel.repaint();
	    		beam.setVisible(true);
	        }
	    	};
	    	TimerTask task2 = new TimerTask() {
	    		public void run() {
	    			beam.setVisible(false);
	    		}
	    	};
	    	if(AnimationButton.IsRunning==false) {
	    		break;
	    	}
	    	Timer timer = new Timer("Timer");
	    	if(MainPanel.delaytime == 1)
	    	{delay = AnimationButton.random.nextLong(100);}
	    	else if(MainPanel.delaytime == 5)
	    	{delay = AnimationButton.random.nextLong(500);}
	    	else
	    	{delay = AnimationButton.random.nextLong(10000);}
	    	timer.schedule(task, delay);
	    	timer.schedule(task2, delay*3/2);
	    	
	    	try {
				Thread.sleep(delay*2);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    	iteration++;
	    }
    	if(iteration<0 || iteration > 100) {
    	AnimationPanel.komora1 = (new ImageIcon("./src/pictures/komora1_closed.png")).getImage();
    	AnimationPanel.komora2 = (new ImageIcon("./src/pictures/komora2_closed.png")).getImage();
    	AnimationPanel.komora3 = (new ImageIcon("./src/pictures/komora3_closed.png")).getImage();
    	if(AnimationPanel.Cs.isChoosen)
			AnimationPanel.Cs.setVisible(false);
		if(AnimationPanel.Co.isChoosen)
			AnimationPanel.Co.setVisible(false);
		if(AnimationPanel.Al.isChoosen)
			AnimationPanel.Al.setVisible(false);
		if(AnimationPanel.Pb.isChoosen)
			AnimationPanel.Pb.setVisible(false);}
    	exit = true;
    	MainPanel.startstopbutton.setText("START");
    	AnimationButton.IsRunning = false;
    }}
  };
  		if(iteration==1000) {
  			iteration = 0;
  		}
    	exit = false;
    	thread.start();
    }
}
