import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Runner extends Human {

  Date finishTime = new Date();

  private SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");

  public Runner(String name, String time){
      this.name = name;
      try {
          this.finishTime = sdf.parse(time);
      } catch (ParseException e) {
          e.printStackTrace();
      }
  }

  public SimpleDateFormat getSdf(){
      return sdf;
  }

  public Date getFinishTime(){
      return finishTime;
  }

}
