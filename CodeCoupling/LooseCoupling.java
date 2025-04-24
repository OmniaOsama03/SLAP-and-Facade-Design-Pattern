package CodeCoupling;

public class LooseCoupling
{
    //Defining an interface (abstraction)
    interface ITopic {
        void understand();
    }

    //Creating a concrete implementation
    class Topic implements ITopic {
        public void understand() {
            System.out.println("Tight coupling concept avoided");
        }
    }

    //Subject now depends on the abstraction, not the implementation
    class Subject {
        private ITopic topic;

        // Constructor injection
        public Subject(ITopic topic) {
            this.topic = topic;
        }

        public void startReading() {
            topic.understand();
        }
    }
}
