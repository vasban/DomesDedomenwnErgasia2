
public class Song {
		private String name;
		private int likes;
		private int id;
		
		public Song() {
			
		}
		
		public Song(int id,String name,int likes) {
			this.id = id;
			this.name = name;
			this.likes = likes;
		}
		
		public void setID(int id) {
			this.id = id;
		}
		
		public void setName(String name) {
			this.name=name;
		}
		
		public void setLikes(int likes) {
			this.likes = likes;
		}
		
		public int getID() {
			return id;
		}
		
		public String getName() {
			return name;
		}
		
		public int getLikes() {
			return likes;
		}
		
		public void print() {
			System.out.println(getID()+" "+getName()+" "+getLikes());
		}
}
