import java.util.ArrayList;

public class Referi extends Human {

    private ArrayList<Runner> runners = new ArrayList<>();

    public Referi(String name){
        this.name = name;
    }

    public void setRunnerTime(String runnerName, String time){
        runners.add(new Runner(runnerName,time));
    }

    public Runner getFirstRunner(){
       Runner firstRunner = runners.get(0);
       for (int i =1; i<runners.size(); i++){
           if (firstRunner.getFinishTime().after(runners.get(i).finishTime)){
             firstRunner = runners.get(i);
           }
       }
       return firstRunner;

    }

    public Runner getLastRunner(){
        Runner lastRunner = runners.get(0);
        for (int i=1; i<runners.size();i++){
            if (lastRunner.getFinishTime().before(runners.get(i).getFinishTime())){
                lastRunner =runners.get(i);
            }

        }
        return lastRunner;

    }

}
