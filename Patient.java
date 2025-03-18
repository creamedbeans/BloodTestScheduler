package bloodtests;

public class Patient {
    private String name;
    private String priority; // urgent, medium, low
    private int age;
    private boolean fromHospitalWard;
    private String gpName; 
    private String clinicName; 

    public Patient(String name, String priority, int age, boolean fromHospitalWard, String gpDetails) {
        this.name = name;  // stores users name, prioriy, age, from hospital or not, gp name and clinic name
        this.priority = priority;
        this.age = age;
        this.fromHospitalWard = fromHospitalWard;
        this.gpName = gpName; 
        this.clinicName = clinicName; 
    
}
    public String getName() {
        return name;
    }

    public String getPriority() {
        return priority;
    }

    public int getAge() {
        return age;
    }

    public boolean isFromHospitalWard() {
        return fromHospitalWard;
    }
    
    public String getGpName() { 
        return gpName;
    }

    public String getClinicName() { 
        return clinicName;
    }
}
