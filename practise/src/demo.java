import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;


class Filter {
    public static Predicate<String> nameStartingWithPrefix(String prefix) {
        return n -> n.startsWith(prefix);
    }
}
class Mapper {
    public static Function<String, CharactersCount> getDistinctCharactersCount() {
        return s -> new CharactersCount(s, (int)s.chars().distinct().count());
    }
}
class CharactersCount {

    private final String name;
    private final Integer distinctCharacterCount;

    public CharactersCount(String name, Integer distinctCharacterCount) {
        this.name = name;
        this.distinctCharacterCount = distinctCharacterCount;
    }

    @Override
    public String toString() {
        return "\"" + this.name + "\" has " + this.distinctCharacterCount + " distinct characters.";
    }

}


public class demo {
    private static final Scanner scanner = new Scanner(System.in);

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "aaryanna",
                "aayanna",
                "airianna",
                "alassandra",
                "allanna",
                "allannah",
                "allessandra",
                "allianna",
                "allyanna",
                "anastaisa",
                "anastashia",
                "anastasia",
                "annabella",
                "annabelle",
                "annebelle"
        );

        names.stream().filter(Filter.nameStartingWithPrefix(scanner.nextLine()))
                .map(Mapper.getDistinctCharactersCount()).forEachOrdered(System.out::println);
    }
}