package chintan.rathod.recyclerviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by Chintan Rathod. (www.chintanrathod.com)
 */
public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private ItemAdapter itemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Celebrity> itemList = new ArrayList<>();

        fillDummyData(itemList);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        itemAdapter = new ItemAdapter(itemList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(itemAdapter);
    }

    private void fillDummyData(ArrayList<Celebrity> celebList) {
        Celebrity celeb1 = new Celebrity();
        celeb1.setName("Johnny Depp");
        celeb1.setFamousMovie("Pirates of the Caribbean");
        celeb1.setProfilePhotoLocation("http://ia.media-imdb.com/images/M/MV5BMTM0ODU5Nzk2OV5BMl5BanBnXkFtZTcwMzI2ODgyNQ@@._V1_UY317_CR4,0,214,317_AL_.jpg");
        celebList.add(celeb1);

        Celebrity celeb2 = new Celebrity();
        celeb2.setName("Arnold Schwarzenegger");
        celeb2.setFamousMovie("The Terminator");
        celeb2.setProfilePhotoLocation("http://ia.media-imdb.com/images/M/MV5BMTI3MDc4NzUyMV5BMl5BanBnXkFtZTcwMTQyMTc5MQ@@._V1._SY209_CR13,0,140,209_.jpg");
        celebList.add(celeb2);

        Celebrity celeb3 = new Celebrity();
        celeb3.setName("Emma Watson");
        celeb3.setFamousMovie("Harry Potter and the Deathly Hallows");
        celeb3.setProfilePhotoLocation("http://ia.media-imdb.com/images/M/MV5BMTQ3ODE2NTMxMV5BMl5BanBnXkFtZTgwOTIzOTQzMjE@._V1._SY209_CR14,0,140,209_.jpg");
        celebList.add(celeb3);

        Celebrity celeb4 = new Celebrity();
        celeb4.setName("Daniel Radcliffe");
        celeb4.setFamousMovie("Harry Potter and the Prisoner of Azkaban");
        celeb4.setProfilePhotoLocation("http://ia.media-imdb.com/images/M/MV5BMTg4NTExODc3Nl5BMl5BanBnXkFtZTgwODUyMDEzMDE@._V1._SY209_CR8,0,140,209_.jpg");
        celebList.add(celeb4);

        Celebrity celeb5 = new Celebrity();
        celeb5.setName("Leonardo DiCaprio");
        celeb5.setFamousMovie("Inception");
        celeb5.setProfilePhotoLocation("http://ia.media-imdb.com/images/M/MV5BMjI0MTg3MzI0M15BMl5BanBnXkFtZTcwMzQyODU2Mw@@._V1._SY209_CR7,0,140,209_.jpg");
        celebList.add(celeb5);

        Celebrity celeb6 = new Celebrity();
        celeb6.setName("Tom Cruise");
        celeb6.setFamousMovie("Top Gun");
        celeb6.setProfilePhotoLocation("http://ia.media-imdb.com/images/M/MV5BMTk1MjM3NTU5M15BMl5BanBnXkFtZTcwMTMyMjAyMg@@._V1._SY209_CR9,0,140,209_.jpg");
        celebList.add(celeb6);

        Celebrity celeb7 = new Celebrity();
        celeb7.setName("Charles Chaplin");
        celeb7.setFamousMovie("Modern Times");
        celeb7.setProfilePhotoLocation("http://ia.media-imdb.com/images/M/MV5BNDcwMDc0ODAzOF5BMl5BanBnXkFtZTgwNTY2OTI1MDE@._V1._SX140_CR0,0,140,209_.jpg");
        celebList.add(celeb7);

        Celebrity celeb8 = new Celebrity();
        celeb8.setName("Morgan Freeman");
        celeb8.setFamousMovie("The Shawshank Redemption");
        celeb8.setProfilePhotoLocation("http://ia.media-imdb.com/images/M/MV5BMTc0MDMyMzI2OF5BMl5BanBnXkFtZTcwMzM2OTk1MQ@@._V1._SX140_CR0,0,140,209_.jpg");
        celebList.add(celeb8);

        Celebrity celeb9 = new Celebrity();
        celeb9.setName("Tom Hanks");
        celeb9.setFamousMovie("The Da Vinci Code");
        celeb9.setProfilePhotoLocation("http://ia.media-imdb.com/images/M/MV5BMTQ2MjMwNDA3Nl5BMl5BanBnXkFtZTcwMTA2NDY3NQ@@._V1._SY209_CR2,0,140,209_.jpg");
        celebList.add(celeb9);

        Celebrity celeb10 = new Celebrity();
        celeb10.setName("Hugh Jackman");
        celeb10.setFamousMovie("The Prestige");
        celeb10.setProfilePhotoLocation("http://ia.media-imdb.com/images/M/MV5BNDExMzIzNjk3Nl5BMl5BanBnXkFtZTcwOTE4NDU5OA@@._V1._SX140_CR0,0,140,209_.jpg");
        celebList.add(celeb10);

        Celebrity celeb11 = new Celebrity();
        celeb11.setName("Matt Damon");
        celeb11.setFamousMovie("The Bourne Identity");
        celeb11.setProfilePhotoLocation("http://ia.media-imdb.com/images/M/MV5BMTM0NzYzNDgxMl5BMl5BanBnXkFtZTcwMDg2MTMyMw@@._V1._SY209_CR8,0,140,209_.jpg");
        celebList.add(celeb11);

        Celebrity celeb12 = new Celebrity();
        celeb12.setName("Sylvester Stallone");
        celeb12.setFamousMovie("Rocky");
        celeb12.setProfilePhotoLocation("http://ia.media-imdb.com/images/M/MV5BMTQwMTk3NDU2OV5BMl5BanBnXkFtZTcwNTA3MTI0Mw@@._V1._SY209_CR5,0,140,209_.jpg");
        celebList.add(celeb12);

        Celebrity celeb13 = new Celebrity();
        celeb13.setName("Will Smith");
        celeb13.setFamousMovie("Men in Black");
        celeb13.setProfilePhotoLocation("http://ia.media-imdb.com/images/M/MV5BNTczMzk1MjU1MV5BMl5BanBnXkFtZTcwNDk2MzAyMg@@._V1._SY209_CR2,0,140,209_.jpg");
        celebList.add(celeb13);

        Celebrity celeb14 = new Celebrity();
        celeb14.setName("Steven Spielberg");
        celeb14.setFamousMovie("Saving Private Ryan");
        celeb14.setProfilePhotoLocation("http://ia.media-imdb.com/images/M/MV5BMTY1NjAzNzE1MV5BMl5BanBnXkFtZTYwNTk0ODc0._V1._SX140_CR0,0,140,209_.jpg");
        celebList.add(celeb14);

        Celebrity celeb15 = new Celebrity();
        celeb15.setName("Al Pacino");
        celeb15.setFamousMovie("The Godfather");
        celeb15.setProfilePhotoLocation("http://ia.media-imdb.com/images/M/MV5BMTQzMzg1ODAyNl5BMl5BanBnXkFtZTYwMjAxODQ1._V1._SX140_CR0,0,140,209_.jpg");
        celebList.add(celeb15);

        Celebrity celeb16 = new Celebrity();
        celeb16.setName("Robert Downey Jr.");
        celeb16.setFamousMovie("The Avengers");
        celeb16.setProfilePhotoLocation("http://ia.media-imdb.com/images/M/MV5BNzg1MTUyNDYxOF5BMl5BanBnXkFtZTgwNTQ4MTE2MjE@._V1._SX140_CR0,0,140,209_.jpg");
        celebList.add(celeb16);

        Celebrity celeb17 = new Celebrity();
        celeb17.setName("Natalie Portman");
        celeb17.setFamousMovie("V for Vendetta");
        celeb17.setProfilePhotoLocation("http://ia.media-imdb.com/images/M/MV5BMTQ3ODE3Mjg1NV5BMl5BanBnXkFtZTcwNzA4ODcxNA@@._V1._SY209_CR8,0,140,209_.jpg");
        celebList.add(celeb17);

        Celebrity celeb18 = new Celebrity();
        celeb18.setName("Dwayne Johnson");
        celeb18.setFamousMovie("WWE Raw");
        celeb18.setProfilePhotoLocation("http://ia.media-imdb.com/images/M/MV5BMTkyNDQ3NzAxM15BMl5BanBnXkFtZTgwODIwMTQ0NTE@._V1._SX140_CR0,0,140,209_.jpg");
        celebList.add(celeb18);

        Celebrity celeb19 = new Celebrity();
        celeb19.setName("Jackie Chan");
        celeb19.setFamousMovie("Jackie Chan Adventures");
        celeb19.setProfilePhotoLocation("http://ia.media-imdb.com/images/M/MV5BMTk4MDM0MDUzM15BMl5BanBnXkFtZTcwOTI4MzU1Mw@@._V1._SY209_CR5,0,140,209_.jpg");
        celebList.add(celeb19);

        Celebrity celeb20 = new Celebrity();
        celeb20.setName("Scarlett Johansson");
        celeb20.setFamousMovie("Lost in Translation");
        celeb20.setProfilePhotoLocation("http://ia.media-imdb.com/images/M/MV5BMTM3OTUwMDYwNl5BMl5BanBnXkFtZTcwNTUyNzc3Nw@@._V1._SY209_CR16,0,140,209_.jpg");
        celebList.add(celeb20);
    }
}
