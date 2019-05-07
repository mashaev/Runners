public class Main {

    public static void main(String[] args) {

   Referi referi = new Referi("Bill");

   referi.setRunnerTime("Nurs","21:32:33");
   referi.setRunnerTime("Taha","18:32:33");
   referi.setRunnerTime("Maks","33:32:33");
   referi.setRunnerTime("Arnur","17:32:33");

 Runner first = referi.getFirstRunner();
        Runner last = referi.getLastRunner();
        System.out.println(first.name+ ":  " + first.getSdf().format(first.getFinishTime()));
        System.out.println(last.name);


    }
}
