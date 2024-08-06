public class Book {
  private String title;
  private String author;
  
  public Book(String title) {
    this.title = title;
    this.author = "Unknown";
  }
  
  public Book(String title, String author) {
    this.title = title;
    this.author = author;
  }
  
  public String getTitle() {
    return title; 
  }
  
  public String getAuthor() {
    return author; 
  }
  
  public int compareTo(Book that) {
    if (this.author.compareTo(that.author) == 0) {
      return this.title.compareTo(that.title);
    }
    return this.author.compareTo(that.author);
  }
  
  public String toString() {
    return String.format("%s by %s", title, author);
  }
}