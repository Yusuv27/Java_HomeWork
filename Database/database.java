package First.Database;

import First.data.Human_friends_PackAnimals;
import First.data.Human_friends_Pets;

import java.util.ArrayList;

public class database {


    public database(ArrayList arrayList,Human_friends_PackAnimals humanFriendsPackAnimals){
        arrayList.add("~");
        arrayList.add(humanFriendsPackAnimals.getType());
        arrayList.add("~");
        arrayList.add(humanFriendsPackAnimals.getType_animals());
        arrayList.add("~");
        arrayList.add(humanFriendsPackAnimals.getName());
        arrayList.add("~");
        arrayList.add(humanFriendsPackAnimals.getDateOfBirth());
        arrayList.add("~");
        arrayList.add(humanFriendsPackAnimals.getCommands());
        arrayList.add("\n");
    }
    public database(ArrayList arrayList, Human_friends_Pets humanFriendsPets){
        arrayList.add("~");
        arrayList.add(humanFriendsPets.getType());
        arrayList.add("~");
        arrayList.add(humanFriendsPets.getType_animals());
        arrayList.add("~");
        arrayList.add(humanFriendsPets.getName());
        arrayList.add("~");
        arrayList.add(humanFriendsPets.getDateOfBirth());
        arrayList.add("~");
        arrayList.add(humanFriendsPets.getCommands());
        arrayList.add("\n");
    }
}
