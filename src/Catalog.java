import java.util.ArrayList;

public class Catalog {
    protected ArrayList<Category> categoryList = new ArrayList<>();

    protected int countCotegory = 0;
    protected int countSubCategory = 0;

    public Catalog (){};

    public Catalog(ArrayList<Category> categoryList){
        this.categoryList = categoryList;
    }

    public void addCategory(Category newCategory){
        if(categoryList.contains(newCategory)){
            countSubCategory++;
        }
        else{
            countCotegory++;
        }

        categoryList.add(newCategory);
    }

    public void showCategory(){
        for(Category o : categoryList){
            System.out.println(o.name);
        }
    }
}
