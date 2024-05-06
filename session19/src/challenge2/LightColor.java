package challenge2;

public class LightColor {

    enum Lights {
        RED {
            public String getRepresentation() {
                return "Stop!";
            }
            public String getDuration() {
                return "30 seconds";
            }
        },
        YELLOW {
            public String getRepresentation() {
                return "Caution.";
            }
            public String getDuration() {
                return "5 seconds";
            }
        },
        GREEN {
            public String getRepresentation() {
                return "Go!";
            }
            public String getDuration() {
                return "45 seconds";
            }
        };

        public abstract String getRepresentation();
        public abstract String getDuration();
    }

    public static void main(String[] args) {
        for (Lights lights : Lights.values()) {
            System.out.println("When you see " + lights + " it means " + lights.getRepresentation() + " Wait for " + lights.getDuration());
        }

        /*for (Lights lights : Lights.values()) {
            System.out.println("When you see " + lights + " wait for " + lights.getDuration());
        }*/
    }
}
