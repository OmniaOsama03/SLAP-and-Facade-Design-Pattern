package CodeCoupling;

public class TightCoupling
{
    class Subject {
        Topic t = new Topic();
        public void startReading() {
            t.understand();
        }
    }

    class Topic {
        public void understand() {
            System.out.println("Tight coupling concept");
        }
    }

}
