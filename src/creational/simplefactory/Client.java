package creational.simplefactory;

import static creational.simplefactory.PostFactory.createPost;

public class Client {

	public static void main(String[] args) {

		//uses one creator (static), must know all the classes whose objects it can create
		Post news = PostFactory.createPost("news");
		Post blog =createPost("blog");
		Post product =createPost("product");
	}
}
