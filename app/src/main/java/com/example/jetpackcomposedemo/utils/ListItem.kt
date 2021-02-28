package com.example.jetpackcomposedemo.utils

import androidx.compose.runtime.mutableStateListOf
import com.example.jetpackcomposedemo.models.Item

class ListItem {
    companion object {
        fun getList(): MutableList<Item> {
            val list = mutableStateListOf<Item>()
            list.add(
                Item(
                    "Afador",
                    "https://dogtime.com/assets/uploads/2019/08/afador-mixed-dog-breed-pictures-cover.jpg",
                    "The Afador is a mixed breed dog–a cross between the Afghan Hound and Labrador Retriever dog breeds. Loyal, energetic, and affectionate, these pups inherited some of the best qualities from both of their parents.\n" +
                            "\n" +
                            "Afadors are also sometimes known as the Afghan Lab. You can find these mixed breed dogs in shelters and breed specific rescues, so remember to always adopt! Don’t shop if you’re looking to add an Afador to your home!"
                )
            )
            list.add(
                Item(
                    "Affenhuahua",
                    "https://dogtime.com/assets/uploads/2020/02/affenhuahua-mixed-dog-breed-pictures-COVER.jpg",
                    "The Affenhuahua is a mixed breed dog–a cross between the Chihuahua and Affenpinscher dog breeds. Petite, sassy, and highly energetic, these pups inherited some of the best traits from both of their parents.\n" +
                            "\n" +
                            "Affenhuahuas are also sometimes called Affen Chi. Despite their status as a designer breed, you can find these mixed breed dogs in shelters and rescues, so adopt! Don’t shop!"
                )
            )
            list.add(
                Item(
                    "Basset Hound",
                    "https://dogtime.com/assets/uploads/2011/01/file_23010_basset-hound-460x290.jpg",
                    "The Basset Hound dog breed was bred for hunting small game such as rabbits and is still used for this purpose in some parts of the United States. When they’re not on the trail of a bunny, they’re laid-back family friends who love kids.\n" +
                            "\n" +
                            "Although they’re purebred dogs, you may find Bassets in shelters or in the care of rescue groups. If this is the breed for you, opt to adopt if possible!"
                )
            )
            list.add(
                Item(
                    "Border Sheepdog",
                    "https://dogtime.com/assets/uploads/2019/11/border-sheepdog-mixed-dog-breed-pictures-cover.jpg",
                    "The Border Sheepdog is a mixed breed dog — a cross between the Border Collie and Shetland Sheepdog breeds. Energetic, intelligent, and playful, these pups inherited some of the best traits from both of their parents.\n" +
                            "\n" +
                            "Border Sheepdogs go by a few names, including Sheltie Border and Border Sheltie. If you like to bring this beautiful mixed breed home, you might be able to find them at shelters or breed specific rescues. Remember, it’s always better to adopt and not shop!"
                )
            )
            list.add(
                Item(
                    "Cavachon",
                    "https://dogtime.com/assets/uploads/2019/08/cavachon-mixed-dog-breed-pictures-cover.jpg",
                    "The Cavachon is a mixed breed dog–a cross between the Cavalier King Charles Spaniel and Bichon Frise dog breeds. Compact, spunky, and full of fun, these pups inherited some of the best traits from both of their parents.\n" +
                            "\n" +
                            "Cavachons don’t go by many other names with the exceptions of Cavalier-Bichon or Bichon-King Charles. Despite their unfortunate status as a designer breed, you may find these mixed breed dogs in shelters and rescues, so remember to adopt! Don’t shop!"
                )
            )
            list.add(
                Item(
                    "Chi-Poo",
                    "https://dogtime.com/assets/uploads/2019/08/chi-poo-mixed-dog-breed-pictures-cover.jpg",
                    "The Chi-Poo is a mixed breed dog — a cross between the Chihuahua and Toy or Teacup Poodle dog breeds. Compact, energetic, and great with kids, these pups inherited some of the best qualities from both of their parents.\n" +
                            "\n" +
                            "Chi-Poos go by several names, including Choodle, Chipoodle, Poochi, and Poohuahua. Despite their unfortunate status as a designer breed, you may find these mixed breed dogs in shelters and rescues. So remember to adopt! Don’t shop!"
                )
            )
            list.add(
                Item(
                    "Horgi",
                    "https://dogtime.com/assets/uploads/2019/08/horgi-mixed-dog-breed-pictures-cover.jpg",
                    "The Horgi is a mixed breed dog — a cross between the Siberian Husky and Corgi dog breeds. Small, playful and full of energy, these pups inherited some of the best qualities from both of their parents.\n" +
                            "\n" +
                            "Horgis are also called Siborgis. Despite their unfortunate status as a designer breed, you may find these mixed breed dogs in shelters and breed specific rescues, so remember to adopt! Don’t shop!"
                )
            )
            list.add(
                Item(
                    "Maltese",
                    "https://dogtime.com/assets/uploads/2011/01/file_23114_maltese-460x290.jpg",
                    "A gentle and fearless dog breed, the Maltese greets everyone as a friend. Their glamorous white coat gives them a look of haughty nobility, but looks can be deceiving.\n" +
                            "\n" +
                            "Even though these are purebred dogs, you may find them in the care of shelters or rescue groups. Remember to adopt! Don’t shop if you want to bring a dog home."
                )
            )
            list.add(
                Item(
                    "Maremma Sheepdog",
                    "https://dogtime.com/assets/uploads/2020/07/Maremma-Sheepdog-breed-pictures-cover.jpg",
                    "IThe Maremma Sheepdog is considered an “Old World European” breed, sharing ancestry with other Eastern European livestock guardian dogs, especially mountain-dwelling dogs, like the Pyrenean Mountain Dog and Kuvasz. Maremma Sheepdogs can be traced back at least to ancient Roman times. Originally bred in Italy, they are still very popular there, and their original purpose continues on: to guard livestock."
                )
            )
            list.add(
                Item(
                    "Pembroke Welsh Corgi",
                    "https://dogtime.com/assets/uploads/2011/01/file_23192_pembroke-welsh-corgi-460x290.jpg",
                    "Originally bred to herd cattle, sheep, and horses, the Pembroke Welsh Corgi is an active and intelligent dog breed. Easy to train and eager to learn, Pembrokes are great with children and other pets, and you can find them in four different coat colors and markings.\n" +
                            "\n" +
                            "Even though these are purebred dogs, you may find them in the care of shelters or rescue groups. Remember to adopt! Don’t shop if you want to bring a dog home."
                )
            )
            list.add(
                Item(
                    "Pocket Beagle",
                    "https://dogtime.com/assets/uploads/2011/01/file_23234_pocket-beagle-460x290.jpg",
                    "Smaller than the average Beagle dog breed, these compact scenthounds are merry and fun-loving. But the Pocket Beagle is still a hound and, as such, requires patience and creative training techniques to overcome their sometimes stubborn nature.\n" +
                            "\n" +
                            "Even though these are purebred dogs, you may find them in the care of shelters or rescue groups. Remember to adopt! Don’t shop if you want to bring a dog home."
                )
            )
            return list
        }

    }
}