import java.util.ArrayList;

public class SummonRift {
    private ArrayList<Team> teams;

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    @Override
    public String toString() {
        return "SummonRift{" +
                "teams=" + teams +
                '}';
    }

    public void inputTable(){
        ArrayList<Team> teams1= new ArrayList<>();
        System.out.println("Nhập thông tin SKT: ");
        Team skt = new Team();
        System.out.println("Nhập thông tin G2: ");
        Team g2 = new Team();
        teams1.add(skt); teams1.add(g2);
        this.teams = teams1;
    }
}
