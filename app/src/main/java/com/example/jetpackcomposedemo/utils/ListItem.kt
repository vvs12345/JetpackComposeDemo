package com.example.jetpackcomposedemo.utils

import androidx.compose.runtime.mutableStateListOf
import com.example.jetpackcomposedemo.models.Item

class ListItem {
    companion object {
        fun getList(): MutableList<Item> {
            val list = mutableStateListOf<Item>()
            list.add(
                Item(
                    "Alaska",
                    "Anchorage",
                    "99501",
                    "Alaska, is a state in the United States. It is in the Northwest corner of the continent of the United States West Coast. Alaska does not touch other US states. It has borders with Canada, the Arctic Ocean, the Pacific Ocean, the Bering Sea, and the Bering Strait."
                )
            )
            list.add(
                Item(
                    "Alabama",
                    "Anchorage",
                    "99501",
                    "Alabama is the 30th largest by area and the 24th-most populous of the U.S. states. ... Alabama is nicknamed the Yellowhammer State, after the state bird. Alabama is also known as the \"Heart of Dixie\" and the \"Cotton State\". The state tree is the long-leaf pine, and the state flower is the camellia."
                )
            )
            list.add(
                Item(
                    "Arizona",
                    "Phoenix",
                    "85001",
                    "Arizona is a land of contradictions. Although widely reputed for its hot low-elevation desert covered with cacti and creosote bushes, more than half of the state lies at an elevation of at least 4,000 feet (1,200 metres) above sea level, and it possesses the largest stand of evergreen ponderosa pine trees in the world."
                )
            )
            list.add(
                Item(
                    "Arkansas",
                    "Little Rock",
                    "72201",
                    "Arkansas ranks 29th among the 50 states in total area, but, except for Louisiana and Hawaii, it is the smallest state west of the Mississippi River. Its neighbours are Missouri to the north, Tennessee and Mississippi to the east, Louisiana to the south, Texas to the southwest, and Oklahoma to the west."
                )
            )
            list.add(
                Item(
                    "California",
                    "Sacramento Los Angeles Beverly Hills",
                    "94203",
                    "California, officially the State of California, is a state in the western part of the United States. It is the third largest US state by total area (after Alaska and Texas) with 163,696 sq mi (423,970 km2) and the largest by population with over 39 million people as of 2019."
                )
            )
            list.add(
                Item(
                    "Colorado",
                    "Denver",
                    "80201",
                    "Colorado is a state in the Mountain West region of the United States. It encompasses most of ... Only small parts of the Colorado Rockies are snow-covered year-round. Much of the alpine snow melts by ... terrain, Colorado is relatively quiet seismically. The U.S. National Earthquake Information Center is located in Golden."
                )
            )
            list.add(
                Item(
                    "Connecticut",
                    "Hartford",
                    "06101",
                    "Connecticut is the third smallest state by area, the 29th most populous, and the fourth most densely populated of the fifty states. It is known as the \"Constitution State\", the \"Nutmeg State\", the \"Provisions State\", and the \"Land of Steady Habits\"."
                )
            )
            list.add(
                Item(
                    "Delaware",
                    "Dover",
                    "19901",
                    "Delaware is 96 miles (154 km) long and ranges from 9 miles (14 km) to 35 miles (56 km) across, totaling 1,954 square miles (5,060 km2), making it the second-smallest state in the United States after Rhode Island."
                )
            )
            list.add(
                Item(
                    "Florida",
                    "Tallahassee",
                    "32301",
                    "It is 345 feet (105 m) above sea level. It is the shortest of the highest points in all other states. Florida has the longest coastline in the continental United States. The Gulf Stream ocean current goes through the Atlantic Ocean near the east coast of Florida, so the water is warmer than the Pacific Ocean."
                )
            )
            list.add(
                Item(
                    "Iowa",
                    "Des Moines",
                    "50309",
                    "Iowa, constituent state of the United States of America. It was admitted to the union as the 29th state on December 28, 1846. As a Midwestern state, Iowa forms a bridge between the forests of the east and the grasslands of the high prairie plains to the west."
                )
            )
            list.add(
                Item(
                    "Nevada",
                    "Carson City",
                    "89701",
                    "Nevada is located in a mountainous region that includes vast semiarid grasslands and sandy alkali deserts. It is the most arid state of the country. The state takes its name from the Spanish nevada (“snow-clad”), a reference to the high mountain scenery of the Sierra Nevada on the western border with California."
                )
            )
            return list
        }

    }
}