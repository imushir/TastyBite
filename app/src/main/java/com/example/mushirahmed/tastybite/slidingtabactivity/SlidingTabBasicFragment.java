package com.example.mushirahmed.tastybite.slidingtabactivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mushirahmed.tastybite.R;
import com.example.mushirahmed.tastybite.common.view.SlidingTabLayout;

import java.util.ArrayList;
/**
 * Created by mushirahmed on 2/5/15.
 */
public class SlidingTabBasicFragment extends Fragment {

    ArrayList<String> snacks = new ArrayList<String>();
    ArrayList<String> nuggets = new ArrayList<String>();
    ArrayList<String> burger = new ArrayList<String>();
    ArrayList<String> sandwiches = new ArrayList<String>();
    ArrayList<String> shawarma = new ArrayList<String>();
    ArrayList<String> rolls = new ArrayList<String>();
    ArrayList<String> pizza_non_veg = new ArrayList<String>();
    ArrayList<String> pizza_veg = new ArrayList<String>();
    ArrayList<String> cocntinental_food = new ArrayList<String>();
    ArrayList<String> appetizer_non_veg = new ArrayList<String>();
    ArrayList<String> appetizer_veg = new ArrayList<String>();
    ArrayList<String> soup_non_veg = new ArrayList<String>();
    ArrayList<String> soup_veg = new ArrayList<String>();
    ArrayList<String> rice_non_veg = new ArrayList<String>();
    ArrayList<String> rice_veg = new ArrayList<String>();
    ArrayList<String> noodels_non_veg = new ArrayList<String>();
    ArrayList<String> noodels_veg = new ArrayList<String>();
    ArrayList<String> sizzlers = new ArrayList<String>();
    ArrayList<String> tbsp = new ArrayList<String>();




    static final String LOG_TAG = "SlidingTabsBasicFragment";

    /**
     * A custom {@link ViewPager} title strip which looks much like Tabs present in Android v4.0 and
     * above, but is designed to give continuous feedback to the user when scrolling.
     */
    private SlidingTabLayout mSlidingTabLayout;

    /**
     * A {@link ViewPager} which will be used in conjunction with the {@link SlidingTabLayout} above.
     */
    private ViewPager mViewPager;

    /**
     * Inflates the {@link View} which will be displayed by this {@link Fragment}, from the app's
     * resources.
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        snacks.add("Fries         : 60S 70L");
        snacks.add("Mexican Fries : 65S 75L");
        snacks.add("Garlic Fries  : 70S 80L");
        snacks.add("Chatpata Fries: 65S 75L");
        snacks.add("Masala Fries  : 65S 75L");
        tbsp.add("Tasty Bite Special Fries : 75S 85L");

        nuggets.add("Chicken Nuggets        : 80S  90L");
        nuggets.add("Chicken Cheese Nuggets : 100S 110L");
        nuggets.add("Chicken Corn           : 85S  95L");

        burger.add("Chicken Burger       : 65");
        burger.add("Whole Chicken Burger : 75");
        burger.add("Mix Veg Burger       : 55");
        tbsp.add("Tasty Byte Special Burger :90");

        sandwiches.add("Veg Sandwich              : 35");
        sandwiches.add("Veg Toast Sandwich        : 45");
        sandwiches.add("Veg Cheese Toast Sandwich : 60");
        sandwiches.add(" Chicken Junglee Sandwich : 70");
        sandwiches.add(" Chicken Tikka Sandwich   : 70");
        sandwiches.add(" Cheese Sandwich          : 65");
        sandwiches.add(" Club Sandwich            : 85");
        tbsp.add(" Tasty Byte Special Sandwich : 80");

        shawarma.add("Khabus            : 45");
        shawarma.add("Bread Roll        : 35");
        shawarma.add("Cheese Kkhabus    : 75");
        shawarma.add("Chesse Beard Roll : 65");
        shawarma.add("Arabian Bhel      : 65");

        rolls.add("Chicken Roll    : 70");
        rolls.add("Mexican Roll    : 80");
        rolls.add("Malai Murg Roll : 95");
        rolls.add("Dragon Roll     : 85");
        rolls.add("veg Kheema Roll : 65");
        rolls.add("Paneer Roll     : 95");
        rolls.add("Russian Roll    : 90");
        tbsp.add("Testy Bite Special Roll : 110");

        pizza_non_veg.add("Chicken Pizza       : 120S 180L ");
        pizza_non_veg.add("Chicken Tikka Pizza : 150S 220L");
        pizza_non_veg.add("Hawali Pizza        : 135S 200L ");
        pizza_non_veg.add("Italin Pizza        : 150S 210L");
        pizza_non_veg.add("Mediterranean Pizza : 150S 230L");
        pizza_non_veg.add("Arabbian Pizza      : 160S 245L");
        pizza_non_veg.add("Mexican Pizza       : 150S 225L ");
        pizza_non_veg.add("Extra Cheese/Topping: 60");
        tbsp.add("Tasty Bite Special Non-Veg Pizza : 170S 270L");

        pizza_veg.add("Mix Veg            : 110M 150L");
        pizza_veg.add("Cheese Margarita   : 120M 160L");
        pizza_veg.add("Veg Exotica        : 130M 170L");
        pizza_veg.add("Mediterranean Pizza: 140M 190L");
        tbsp.add("Tasty Byte Special Veg Pizza :150M 210L");

        cocntinental_food.add("Popcorn Chicken      : 120");
        cocntinental_food.add(" Lolly Pop(6Pcs)     : 120 ");
        cocntinental_food.add("Spider Chicken(6Pcs) : 140");
        cocntinental_food.add("Chicken Tikka Stick(3Stick) : 140");


        appetizer_non_veg.add("Chicken cripsy          : 160");
        appetizer_non_veg.add("Exotic Chicken          : 220");
        appetizer_non_veg.add("Mayonnaise Chicken(Dry) : 170");
        appetizer_non_veg.add("Shanghai Chicken(Dry)   : 180");
        appetizer_non_veg.add("Tangy Masala Lolly Pop  : 150 ");
        appetizer_non_veg.add("Chicken Chilly(Dry)     : 130");
        appetizer_non_veg.add("Chicken Chilly(Gravy)   : 140");
        appetizer_non_veg.add("Manchurian(Dry)         : 120");
        appetizer_non_veg.add("Manchurian(Gravy)       : 130");
        appetizer_non_veg.add("Chicken Tikka(Dry)      : 160");
        appetizer_non_veg.add("Chicken Tikka(Gravy)    : 170");
        appetizer_non_veg.add("Dragon Chicken(Dry)     : 140");
        appetizer_non_veg.add("Dragon Chicken(Gravy)   : 160");
        appetizer_non_veg.add("Dry Fruit Chicken       : 200");
        appetizer_non_veg.add("Gold Finget             : 190");
        appetizer_non_veg.add("Chinese Chicken         : 190");
        appetizer_non_veg.add("Lovely Chicken          : 170");
        appetizer_non_veg.add("Lacho Chicken           : 160");
        appetizer_non_veg.add("Schezwan Chicken Finger : 165");
        appetizer_non_veg.add("Chicken Woodstar        : 155");
        appetizer_non_veg.add("Chicken Black Garlic    : 155");
        appetizer_non_veg.add("Chicken Schezwan Star   : 160");
        appetizer_non_veg.add("Chicken Red Pepper      : 170");
        appetizer_non_veg.add("American Chopsuey       : 130");
        appetizer_non_veg.add("Chicken Afganistan      : 165");
        appetizer_non_veg.add("Hunan Gravy             : 155");
        appetizer_non_veg.add("Chicken 65(Gravy)       : 170");


        appetizer_veg.add("Chinese Bhel          : 50");
        appetizer_veg.add("Manchurian Leg(Dry)   : 100");
        appetizer_veg.add("Manchurian Leg(Gravy) : 130");
        appetizer_veg.add("Aloo Chilly(Dry)      : 100");
        appetizer_veg.add("Panner Cripsy         : 170");
        appetizer_veg.add("Aloo Cripsy           : 150");
        appetizer_veg.add("Paneer Gravy(Gravy)   : 180");
        appetizer_veg.add("Paneer Chilly(Dry)    : 150");
        appetizer_veg.add("American Chopsuey     : 100");

        soup_non_veg.add("Manchow Soup      : 80");
        soup_non_veg.add("Hot & Sour Soup   : 85");
        soup_non_veg.add("Sweet Corn Soup   : 70");
        soup_non_veg.add("Lung-Fung Soup    : 80 ");
        soup_non_veg.add("Clear Soup        : 70");
        soup_non_veg.add("Burnt Ginger Soup : 85 ");
        soup_non_veg.add("Mini Strong Soup  : 85");
        soup_non_veg.add("Pudina Soup       : 80");
        soup_non_veg.add("Lemon Soup        : 75");
        tbsp.add("Tasty Byte Special Soup : 90");

        soup_veg.add("Manchow Soup      : 70");
        soup_veg.add("Hot & Sour Soup   : 75");
        soup_veg.add("Sweet Corn Soup   : 65");
        soup_veg.add("Clear Soup        : 60");
        soup_veg.add("Tomato Soup       : 60");
        soup_veg.add("Burnt Garlic Soup : 75");
        soup_veg.add("Mini Strong Soup  : 75");
        soup_veg.add("Burnt Ginger Soup : 80");
        soup_veg.add("Lemon Soup        : 65");
        soup_veg.add("Pudina Soup       : 70");


        rice_non_veg.add("Fried Rice        : 60H 95F");
        rice_non_veg.add("Shezwan Rice      : 70H 110F");
        rice_non_veg.add("Oriental Rice     : 70H 110F");
        rice_non_veg.add("Singapore Rice    : 70H 120F");
        rice_non_veg.add("Hong-Kong Rice    : 70H 120F");
        rice_non_veg.add("Burnt Garlic Rice : 70H 110F");
        rice_non_veg.add("Manchurian Rice   : 100H 160F");
        rice_non_veg.add("Malaysian Rice    : 115H 170F");
        rice_non_veg.add("Dragon Rice       : 110H 170F");
        rice_non_veg.add("Triple Rice       : 115H 170F");
        rice_non_veg.add("Thousand Rice     : 110H 175F");
        rice_non_veg.add("Korean Rice       : 105H 170F");
        rice_non_veg.add("Hunan Rice        : 105H 170F");
        rice_non_veg.add("Chopper Rice      : 120H 180F");
        rice_non_veg.add("Sherpa Rice       : 110H 170F");
        tbsp.add("Tasty Byte Special Non-Veg Rice : 130H 190F");

        rice_veg.add("Fried Rice        : 55H 80F");
        rice_veg.add("Shezwan Rice      : 60H 85F");
        rice_veg.add("Oriental Rice     : 70H 90F");
        rice_veg.add("Singapore Rice    : 70H 95F");
        rice_veg.add("Hong-Kong Rice    : 70H 95F");
        rice_veg.add("Hara Bhara Rice   : 95H 140F");
        rice_veg.add("Manchurian Rice   : 80H 130F");
        rice_veg.add("Malaysian Rice    : 90H 140F");
        rice_veg.add("Dragon Rice       : 90H 130F");
        rice_veg.add("Triple Rice       : 90H 130F");
        rice_veg.add("Thousand Rice     : 90H 130F");
        rice_veg.add("Korean Rice       : 90H 130F");
        rice_veg.add("Hunan Rice        : 90H 130F");
        rice_veg.add("Chopper Rice      : 95H 140F");
        rice_veg.add("Sherpa Rice       : 95H 140F");
        tbsp.add("Tasty Byte Special Veg Rice : 100H 160F");


        noodels_non_veg.add("Hakka Nooodles         : 70H 100F");
        noodels_non_veg.add("Schezwan Hakka Noodles : 80H 110F");
        noodels_non_veg.add("Oriental Noodles       : 80H 110F");
        noodels_non_veg.add("Singapore Noodles      : 90H 125F");
        noodels_non_veg.add("Hong kong Noodles      : 90H 125F");
        noodels_non_veg.add("Burnt Garlic Noodles   : 75H 120F");
        noodels_non_veg.add("Manchurian Noodles     : 105H 170F");
        noodels_non_veg.add("Malaysian Noodles      : 105H 170F");
        noodels_non_veg.add("Dragon Noodles         : 105H 170F");
        noodels_non_veg.add("Triple Noodles         : 110H 180F");
        noodels_non_veg.add("Thousand Noodles       : 110H 180F");
        noodels_non_veg.add("Korean Noodles         : 110H 180F");
        noodels_non_veg.add("Hunan Noodles          : 110H 180F");
        noodels_non_veg.add("Chopper Noodles        : 130H 190F");
        noodels_non_veg.add("Hara Bhara Noodles     : 110H 180F");
        noodels_non_veg.add("Sherpa Noodles         : 110H 180F");
        tbsp.add("Testy Bite Special Noodles : 150H 200F");

        noodels_veg.add("Hakka Nooodles         : 55H 85F");
        noodels_veg.add("Schezwan Hakka Noodles : 60H 90F");
        noodels_veg.add("Oriental Noodles       : 60H 95F");
        noodels_veg.add("Singapore Noodles      : 60H 90F");
        noodels_veg.add("Hong kong Noodles      : 60H 90F");
        noodels_veg.add("Burnt Garlic Noodles   : 60H 90F");
        noodels_veg.add("Manchurian Noodles     : 85H 130F");
        noodels_veg.add("Malaysian Noodles      : 85H 130F");
        noodels_veg.add("Dragon Noodles         : 90H 135F");
        noodels_veg.add("Triple Noodles         : 90H 135F");
        noodels_veg.add("Thousand Noodles       : 85H 130F");
        noodels_veg.add("Hara Bhara Noodles     : 90H 140F");
        noodels_veg.add("Sherpa Noodles         : 90H 140F");
        noodels_veg.add("Chopper Noodles        : 90H 140F");


        sizzlers.add("Chicken Tikka Sizzler   : 250");
        sizzlers.add("Chicken Shaslik Sizzler : 230");
        sizzlers.add("Chicken Cruncy Sizzler  : 250");
        sizzlers.add("Continental Sizzler     : 230");
        tbsp.add("Tasty Bite Special Sizzler : 260");




        return inflater.inflate(R.layout.fragment_sample, container, false);
    }

    // BEGIN_INCLUDE (fragment_onviewcreated)
    /**
     * This is called after the {@link #onCreateView(LayoutInflater, ViewGroup, Bundle)} has finished.
     * Here we can pick out the {@link View}s we need to configure from the content view.
     *
     * We set the {@link ViewPager}'s adapter to be an instance of {@link SamplePagerAdapter}. The
     * {@link SlidingTabLayout} is then given the {@link ViewPager} so that it can populate itself.
     *
     * @param view View created in {@link #onCreateView(LayoutInflater, ViewGroup, Bundle)}
     */
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // BEGIN_INCLUDE (setup_viewpager)
        // Get the ViewPager and set it's PagerAdapter so that it can display items
        mViewPager = (ViewPager) view.findViewById(R.id.viewpager);
        mViewPager.setAdapter(new SamplePagerAdapter());
        // END_INCLUDE (setup_viewpager)

        // BEGIN_INCLUDE (setup_slidingtablayout)
        // Give the SlidingTabLayout the ViewPager, this must be done AFTER the ViewPager has had
        // it's PagerAdapter set.
        mSlidingTabLayout = (SlidingTabLayout) view.findViewById(R.id.sliding_tabs);
        mSlidingTabLayout.setViewPager(mViewPager);
        // END_INCLUDE (setup_slidingtablayout)
    }


    class SamplePagerAdapter extends PagerAdapter {


        @Override
        public int getCount()
        {
            return 19;
        }

              @Override
        public boolean isViewFromObject(View view, Object o)
        {
            return o == view;
        }


        @Override
        public CharSequence getPageTitle(int position) {
            if (position == 0)
                return "SNACKS";
            else if (position == 1)
                return "NUGGETS";
            else if (position == 2)
                return "BURGER";
            else if (position == 3)
                return "SANDWICHES";
            else if (position == 4)
                return "SHAWARMA";
            else if (position == 5)
                return "ROLLS";
            else if (position == 6)
                return "PIZZA(NON-VEG)";
            else if (position == 7)
                return "PIZZA(VEG)";
            else if (position == 8)
                return "CONTINENTAL FOOD";
            else if (position == 9)
                return "APPETIZER(NON-VEG)";
            else if (position == 10)
                return "APPETIZER(VEG)";
            else if (position == 11)
                return "SOUP(NON-VEG)";
            else if (position == 12)
                return "SOUP(VEG)";
            else if (position == 13)
                return "RICE(NON-VEG)";
            else if (position == 14)
                return "RICE(VEG)";
            else if (position == 15)
                return "NOODLES(NON-VEG)";
            else if (position == 16)
                return "NOODLES(VEG)";
            else if (position == 17)
                return "SIZZLERS";
            else if (position == 18)
                return "Tasty Bite Special";
            return null;
        }



        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            // Inflate a new layout from our resources
            ArrayAdapter<String> adapter;


            View view = getActivity().getLayoutInflater().inflate(R.layout.pager_item,
                    container, false);
            // Add the newly created View to the ViewPager
            container.addView(view);


            ListView lstvwMenu = (ListView) view.findViewById(R.id.lstmenu);


            if(position == 0)
            {
                adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,snacks);
                lstvwMenu.setAdapter(adapter);
            }
            else if (position == 1)
            {
                adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,nuggets);
                lstvwMenu.setAdapter(adapter);

            }
            else if (position == 2)
            {
                adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,burger);
                lstvwMenu.setAdapter(adapter);

            }
            else if (position == 3)
            {
                adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,sandwiches);
                lstvwMenu.setAdapter(adapter);
            }
            else if (position == 4)
            {
                adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,shawarma);
                lstvwMenu.setAdapter(adapter);
            }

            else if (position == 5)
            {
                adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,rolls);
                lstvwMenu.setAdapter(adapter);
            }
            else if (position == 6)
            {
                adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,pizza_non_veg);
                lstvwMenu.setAdapter(adapter);
            }
            else if (position == 7)
            {
                adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,pizza_veg);
                lstvwMenu.setAdapter(adapter);
            }
            else if (position == 8)
            {
                adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,cocntinental_food);
                lstvwMenu.setAdapter(adapter);
            }
            else if (position == 9)
            {
                adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,appetizer_non_veg);
                lstvwMenu.setAdapter(adapter);
            }
            else if (position == 10)
            {
                adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,appetizer_veg);
                lstvwMenu.setAdapter(adapter);
            }
            else if (position == 11)
            {
                adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,soup_non_veg);
                lstvwMenu.setAdapter(adapter);
            }
            else if (position == 12)
            {
                adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,soup_veg);
                lstvwMenu.setAdapter(adapter);
            }
            else if (position == 13)
            {
                adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,rice_non_veg);
                lstvwMenu.setAdapter(adapter);
            }
            else if (position == 14)
            {
                adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,rice_veg);
                lstvwMenu.setAdapter(adapter);
            }
            else if (position == 15)
            {
                adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,noodels_non_veg);
                lstvwMenu.setAdapter(adapter);
            }
            else if (position == 16)
            {
                adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,noodels_veg);
                lstvwMenu.setAdapter(adapter);
            }
            else if (position == 17)
            {
                adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,sizzlers);
                lstvwMenu.setAdapter(adapter);
            }
            else if (position == 18)
            {
                adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,tbsp);
                lstvwMenu.setAdapter(adapter);
            }

            // Return the View
            return view;


        }



        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);

        }

    }
}

