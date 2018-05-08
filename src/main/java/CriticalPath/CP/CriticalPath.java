package CriticalPath.CP;

import java.util.ArrayList;


public class CriticalPath {
	private  Integer sum = 0;
	private  ArrayList<Task> list = new ArrayList<Task>();
	private  ArrayList<Path> paths = new ArrayList<Path>();
	private  ArrayList<Task> tasks = App.tasks;
	private  Integer index = 0;
	public ArrayList<Path> getPaths() {
		return paths;
	}
	public void calculateCriticalPath(Task t) {
		sum += t.getDuration();
		list.add(t);
		if (t.getForwardRelations() != null) {
			for (Task task : t.getForwardRelations()) {
				calculateCriticalPath(task);
			}
		}
		else
		{
			
			paths.add(new Path(list, sum, index));
			index++;
			list = new ArrayList<Task>();
			list.add(tasks.get(0));
			sum = tasks.get(0).getDuration();
			
		}
	}
	
	public Path getCriticalPath(){
		Integer tempKey = 0;
		Integer index = 0;
		for (Path path : paths) {
			if(path.duration > tempKey) {
				tempKey = path.duration;
				index = path.getIndex();
			}
		}
		return paths.get(index);
	}
}
