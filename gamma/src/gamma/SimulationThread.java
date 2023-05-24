package gamma;

import java.util.Timer;
import java.util.TimerTask;

import org.jfree.data.statistics.HistogramDataset;

public class SimulationThread implements Runnable{
	private boolean exit;
	
	static long delay;
	static int iteration;
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
    	while(iteration<1000) {
	    	TimerTask task = new TimerTask() {
	        public void run() {
	        	GraphPanel.values1[iteration] = Math.log(1/AnimationButton.random.nextDouble());
	        	System.out.println(GraphPanel.values1[iteration] + "    " + iteration);
	        	GraphPanel.dataset1 = new HistogramDataset();
	    		GraphPanel.dataset1.addSeries("key", GraphPanel.values1, 100);
	    		GraphPanel.chart1.getXYPlot().setDataset(GraphPanel.dataset1);
	    		GraphPanel.graphpaint1 = new GraphPaint1();
	    		GraphPanel.graphpaint1.revalidate();
	    		GraphPanel.graphpaint1.repaint();
	    		Main.graphpanel.repaint();
	        }
	    	};
	    	if(AnimationButton.IsRunning==false) {
	    		exit = true;
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
	    	
	    	try {
				Thread.sleep(delay*2);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    	iteration++;
	    }
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
