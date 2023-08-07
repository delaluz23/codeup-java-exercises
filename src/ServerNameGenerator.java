public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] adjectives = {
                "Witty",
                "Radiant",
                "Lively",
                "Quirky",
                "Majestic",
                "Vibrant",
                "Cozy",
                "Spicy",
                "Dazzling",
                "Glistening"
        };
        String[] nouns = {
                "Mountain",
                "Bicycle",
                "Ocean",
                "Camera",
                "Guitar",
                "Book",
                "Rainbow",
                "Pizza",
                "Diamond",
                "Galaxy"
        };
        String result = returnRandom(adjectives, nouns);
        System.out.println("here is your server name : ");
        System.out.println(result);
    }

    public static String returnRandom(String[] adjectives, String[] nouns){
        int randomNumb = (int) ((Math.random() * adjectives.length));
        int randomNumbTwo = (int) ((Math.random() * nouns.length));


        String one =adjectives[randomNumb];
        String two =nouns[randomNumbTwo];


        return(one + "-" + two);
    }
}
