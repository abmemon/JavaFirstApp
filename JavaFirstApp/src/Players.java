import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Players {

    public void getPlayers(){
        
        List<String> team = Arrays.asList("Ahmed", "Muhammad", "Mustafa");
        
        List<String> finalTeam = team.stream()
                                .filter(tm->!tm.isEmpty())
                                .collect(Collectors.toList());

        for(int i=0; i < finalTeam.size(); i++){
            System.out.println(finalTeam.get(i));
            //System.out.println("Event Number" + finalTeam);
        }

    }

}
