import java.util.ArrayList;
import java.util.List;

public class Person {

    private Job job;
    private Education education;

    public Person(){
        this.job=new Job();
        job.setSalary(1000L);
    }
    public long getSalary() {
        return job.getSalary();
    }

    public static void main(String[] args){
        Person per = new Person();
        Education edu = per.new Education();
        System.out.println(edu.toString());
        System.out.println();

        Job job = per.new Job();
        job.setId(1);
        job.setRole("Janitor");
        job.setSalary(1000);
        System.out.println(job.toString());
    }
    class Education{

        public List<String> schools()
        {
            List<String> Schools = new ArrayList<String>();
            Schools.add("Luther");          Schools.add("Peterson");
            Schools.add("Saint Joseph");    Schools.add("Parkland");
            Schools.add("Saint John");      Schools.add("Sandy Hook");
            Schools.add("Saint Thomas");    Schools.add("Petworth");
            Schools.add("Saint Mary's");    Schools.add("School without walls");

            return Schools;
        }
        public String toString(){
            for(String school : schools()){
                System.out.println("schoolname " + school);
            }
            return " ";
        }
    }

    class Job {
        private String role;
        private long salary;
        private int id;
        public String getRole() {
            return role;
        }
        public void setRole(String role) {
            this.role = role;
        }
        public long getSalary() {
            return salary;
        }
        public void setSalary(long salary) {
            this.salary = salary;
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }

        public String toString(){
            return getId() + " has " + getRole() + " and makes " + getSalary();
        }
    }
}