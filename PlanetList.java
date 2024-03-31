// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество егo повторений в списке. 
// Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlanetList {
    public static void main(String[] args) {
        List <String> planets = getPlanets();
        System.out.println(planets);
        getPrintCountPlanet(planets);
        removePlanets(planets);
        System.out.println(planets);
    }

    private static void getPrintCountPlanet(List<String> planets) {
        List <String> sortPlanets = new ArrayList(planets);
        Collections.sort(sortPlanets);
        System.out.println(sortPlanets);
        int count = 1;
        for (int i = 1; i < sortPlanets.size(); i++) {
            if (sortPlanets.get(i).equals(sortPlanets.get(i-1))) {
                count ++;
            } else{
                System.out.println(sortPlanets.get(i-1) + "->" + count);
                count = 1;
            }
        }
    }

    private static List<String> getPlanets() {
        List <String> planets = new ArrayList<>();
        planets.add("Земля");
        planets.add("Венера");
        planets.add("Уран");
        planets.add("Нептун");
        planets.add("Нептун");
        planets.add("Венера");
        planets.add("Венера");
        planets.add("Сатурн");
        planets.add("Юпитер");
        planets.add("Марс");
        planets.add("Меркурий");
        return planets;
    }
    public static void removePlanets(List<String> planets) {
        for (int i = 0; i < planets.size()-1; i++) {
            String currentPlanet = planets.get(i);
            for (int j = i+1; j < planets.size(); j++) {
                if (planets.get(j).equals(currentPlanet)) {
                    planets.remove(j);
                    j--;
                    
                }
            }
            
        }
    }




}
