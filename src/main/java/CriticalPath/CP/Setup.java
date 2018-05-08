package CriticalPath.CP;

import java.util.ArrayList;

public class Setup {

	private  ArrayList<Task> tasks = App.tasks;
	
	public void setUpForwardTime() {
		for (Task task : tasks) {
			if (task.getTask().equals("start")) {
				task.setES(1);
				task.setEF(task.getDuration() + task.getES() - 1);

			}
			if (task.getForwardRelations() != null) {
				Task[] relations = task.getForwardRelations();
				for (Task relation : relations) {
					if (relation.getES() != null) {
						if (relation.getES() < (task.getEF() + 1)) {
							relation.setES(task.getEF() + 1);
							relation.setEF(relation.getDuration() + relation.getES() - 1);
						}
						relation.addBackwardRelations(task);
					} else {
						relation.setES(task.getEF() + 1);
						relation.setEF(relation.getDuration() + relation.getES() - 1);
						relation.addBackwardRelations(task);
					}
				}
			}
		}
	}

	public void setUpBackwardTime() {
		for (int i = tasks.size() - 1; i >= 0; i--) {
			ArrayList<Task> relations = tasks.get(i).getBackwardRelations();
			if (tasks.get(i).getTask().equals("end")) {
				tasks.get(i).setLF(tasks.get(i).getEF());
				tasks.get(i).setLS(tasks.get(i).getLF() - tasks.get(i).getDuration() + 1);
			}
			if (tasks.get(i).getBackwardRelations().size() != 0) {
				for (Task relation : relations) {
					if (relation.getLF() != null) {
						if (relation.getLF() > (tasks.get(i).getLS() - 1)) {
							relation.setLF(tasks.get(i).getLS() - 1);
							relation.setLS(relation.getLF() - relation.getDuration() + 1);
						}
					} else {
						relation.setLF(tasks.get(i).getES() - 1);
						relation.setLS(relation.getLF() - relation.getDuration() + 1);
					}

				}

			}
		}
	}
}
