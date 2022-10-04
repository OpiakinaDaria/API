public class Main {


    public static void main (String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;

        post.birtday = new FormDate();
        post.birtday.day = 13;
        post.birtday.month = 6;
        post.birtday.year = 1999;
    }
}
