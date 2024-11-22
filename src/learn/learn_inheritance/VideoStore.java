package learn.learn_inheritance;

class Video {
  String title;
  int length;
  boolean avail;

  public Video(String ttl) {
    title = ttl;
    length = 90;
    avail = true;
  }

  public Video(String ttl, int lngth) {
    title = ttl;
    length = lngth;
    avail = true;
  }

  public String toString() {
    return title + ", " + length + " min. available:" + avail;
  }

}

public class VideoStore {
  public static void main(String args[]) {
    Video item1 = new Video("Jaws", 120);
    Video item2 = new Video("Star Wars");

    System.out.println(item1.toString());
    System.out.println(item2.toString());
  }
}
