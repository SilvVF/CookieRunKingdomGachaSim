package com.example.gacha_data.local

import com.example.core.data.local.entity.CookieEntity
import com.example.core.R
import com.example.core.util.CookieConstants.AMBUSH
import com.example.core.util.CookieConstants.ANCIENT
import com.example.core.util.CookieConstants.BOMBER
import com.example.core.util.CookieConstants.CHARGE
import com.example.core.util.CookieConstants.COMMON
import com.example.core.util.CookieConstants.DEFENSE
import com.example.core.util.CookieConstants.EPIC
import com.example.core.util.CookieConstants.FRONT
import com.example.core.util.CookieConstants.HEALING
import com.example.core.util.CookieConstants.LEGENDARY
import com.example.core.util.CookieConstants.MAGIC
import com.example.core.util.CookieConstants.MIDDLE
import com.example.core.util.CookieConstants.RANGED
import com.example.core.util.CookieConstants.RARE
import com.example.core.util.CookieConstants.REAR
import com.example.core.util.CookieConstants.SUPER_EPIC
import com.example.core.util.CookieConstants.SUPPORT

object DefaultCookieList {
    val list = listOf(
       CookieEntity(
           name = "Ginger Brave",
           soulStoneCount = 0,
           soulStoneImage = R.drawable.ginger_brave_soulstone,
           cookieCard = R.drawable.ginger_brave_card,
           cookieFaceIcon = R.drawable.ginger_brave_face_icon,
           cookieFullArt = R.drawable.ginger_brave_full_art,
           skillIcon = R.drawable.ginger_brave_skill,
           type = CHARGE,
           position = FRONT,
           rarity = COMMON,
           skillDesc = "Dashes forward and deals area damage to all enemies in his way.",
           skill = "Brave Dash",
           gameDescription = "GingerBrave was the first Cookie to escape from the Witch's oven. It is unknown how this Cookie came to life, but rumor has it that the Witch accidentally used magic powder instead of ginger powder.",
           quote = "It's now or never! Let's go!",
           cooldown = 8,
           skillStats = "Damage dealt: 150.0% (+1.2% DMG per level)"
       ),
        CookieEntity(
            name = "Strawberry Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.straw_soulstone,
            cookieCard = R.drawable.straw_card,
            cookieFaceIcon = R.drawable.straw_face_icon,
            cookieFullArt = R.drawable.straw_full_art,
            skillIcon = R.drawable.straw_skill,
            type = DEFENSE,
            position = FRONT,
            rarity = COMMON,
            skillDesc = "Scared Strawberry Cookie spins with her lollipop, dealing damage to all enemies within range.",
            skill = "Don't Come Near!",
            gameDescription = "Shyness can be quite advantageous. Why? Strawberry Cookie contains no real strawberries, only the flavoring. Were she as active and energetic as other cookies, her artificial strawberry fragrance would have worn off in no time! Strawberry Cookie feels so ashamed of her main ingredient, she'd never want the truth to come out. If only she understood that this yummy strawberry scent is one of the many reasons other Cookies love her!",
            quote = "Who says I'm lonely? I'm not...",
            cooldown = 10,
            skillStats = "Damage dealt: 21.0% (+0.3% DMG dealt per level)"
        ),
        CookieEntity(
            name = "Wizard Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.wizard_soulstone,
            cookieCard = R.drawable.wizard_card,
            cookieFaceIcon = R.drawable.wizard_face_icon,
            cookieFullArt = R.drawable.wizard_full_art,
            skillIcon = R.drawable.wizard_skill,
            type = RANGED,
            position = MIDDLE,
            rarity = COMMON,
            skillDesc = "Summons a magic lightning storm that moves forward, dealing damage over time to all enemies within range.",
            skill = "Magic Storm",
            gameDescription = "Wizard Cookie came to possess the Witch's Candy Wand by accident (or not?). Within it, he discovered unique magical powers. His popping candy ice cream cone hat is the finishing touch to his wizard look. Frequently used spells include the festive Hocus-Party-Pocus and Abra-Cookie-Cadabra, which brings unexpected luck and fun",
            quote = "Don't disturb me. I need to focus.",
            cooldown = 13,
            skillStats = "Damage dealt: 40.0% base (+0.5% DMG per level)"
        ),
        CookieEntity(
            name = "Beet Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.beet_soulstone,
            cookieCard = R.drawable.beet_card,
            cookieFaceIcon = R.drawable.beet_face_icon,
            cookieFullArt = R.drawable.beet_full_art,
            skillIcon = R.drawable.beet_skill,
            type = RANGED,
            position = REAR,
            rarity = COMMON,
            skillDesc = "Shoots several bolts in a row at a target with the lowest HP. Don't mess with a hunter!",
            skill = "Hunter's Sense",
            gameDescription = "A strong, persistent, rocky-soil-enduring wild beet was used in the making of Beet Cookie. This Cookie not only inherited all these qualities of her mother ingredient but also went up a notch, becoming able to survive just about anywhere! Beet Cookie settled in the deep forest and has been protecting her territory with her trusty crossbow ever since. Storm, rain, blizzard, or vicious predators-no threat is too serious. There's only one thing that can spring a surprise on this lonely ranger: unexpected Cookie visitors.",
            quote = "Day 1,000 at this current camp!",
            cooldown = 12,
            skillStats = "Damage dealt: 67.0% (+0.9% - 1% DMG dealt per level)"
        ),
        CookieEntity(
            name = "Ninja Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.ninja_soulstone,
            cookieCard = R.drawable.ninja_card,
            cookieFaceIcon = R.drawable.ninja_face_icon,
            cookieFullArt = R.drawable.ninja_full_art,
            skillIcon = R.drawable.ninja_skill,
            type = AMBUSH,
            position = MIDDLE,
            rarity = COMMON,
            skillDesc = "Jumps in the air, throwing shuriken twice and causing small-area damage.",
            skill = "Swift Strike",
            gameDescription = "Just as making perfect dough demands diligent kneading, tireless training is of equal importance on the path of the ninja. The flavor and ingredients of the mysterious Ninja Cookie remain unknown. He is the only Cookie who can jump that many times. Some say he steps on the air itself, others claim he is using some sort of a shadow clone technique... And with training, he can jump even higher! Sky's the limit, literally.",
            quote = "Swift as the wind.",
            cooldown = 11,
            skillStats = "Damage dealt: 89.0% (+ ~1.2% DMG per level)"
        ),
        CookieEntity(
            name = "Angel Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.angel_soulstone,
            cookieCard = R.drawable.angel_card,
            cookieFaceIcon = R.drawable.angel_face_icon,
            cookieFullArt = R.drawable.angel_full_art,
            skillIcon = R.drawable.angel_skill,
            type = HEALING,
            position = REAR,
            rarity = COMMON,
            skillDesc = "Blessed be the Cookies! Flies up in the air, restoring HP of all party members.",
            skill = "Celestial Light",
            gameDescription = "Angel Cookie is trying to master the art of flying but can't rise higher than a teeny tiny bit above the ground just yet! Angel Cookie's favorite animals are penguins, ostriches, and baby chicks. Can you guess why? The Cookie's shiny golden curls are truly special. Not only do they grant their owner healing powers, they are remarkably lovely to look at!",
            quote = "Come fly with me...",
            cooldown = 15,
            skillStats = "Healing: 50.0% of ATK (+0.6% - 0.7% Healing per level)"
        ),
        CookieEntity(
            name = "Princess Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.princess_soulstone,
            cookieCard = R.drawable.princess_card,
            cookieFaceIcon = R.drawable.princess_face_icon,
            cookieFullArt = R.drawable.princess_full_art,
            skillIcon = R.drawable.princess_skill,
            type = CHARGE,
            position = FRONT,
            rarity = RARE,
            skillDesc = "The world is full of adventure! Princess Cookie swings her scepter with a noble smile, causing area damage and decreasing the enemies' Defense.",
            skill = "Royal Swing",
            gameDescription = "Don't be fooled by her adorable smile and cute hairdo. She's not the graceful and regal princess you're looking for! Trouble follows the ever-curious Princess Cookie everywhere she goes, but somehow she manages to sort things out. After all, it's hard not to fall for Her Majesty's charm!",
            quote = "And where shall I go today?",
            cooldown = 13,
            skillStats = "Damage dealt: 319.0% base (+4.4% DMG per level) -15.0% DEF for 6.0 sec"
        ),
        CookieEntity(
            name = "Avocado Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.avocado_soulstone,
            cookieCard = R.drawable.avocado_card,
            cookieFaceIcon = R.drawable.avocado_face_icon,
            cookieFullArt = R.drawable.avocado_full_art,
            skillIcon = R.drawable.avocado_skill,
            type = DEFENSE,
            position = FRONT,
            rarity = RARE,
            skillDesc = "Strikes the ground with her hammer several times, dealing area damage. The clear sound of ringing metal raises the party's Morale, increasing Attack Power of the Cookie with the highest Attack Power.",
            skill = "Battle Smithing",
            gameDescription = "Gather some avocados (the more, the better!) ripened under the hot sun (the more ripe, the better!), then mash, mash, MASH! That's how you can make a healthy and nutritious Avocado Cookie! But you know what terribly lacked nutrients growing up? Her sense of humor! And you will soon know why. Avocado Cookie is a famous master smith. She spends days and nights at the smithy making this and that. It is said that Avocado Cookie can create just about anything! Except for a decent joke, ahem.",
            quote = "What do you call a fish with no eye? FSH! Haha!",
            cooldown = 12,
            skillStats = "Damage dealt: 55.0% base (+5.6% DMG per level) +30.0% ATK for 6.0 sec"
        ),
        CookieEntity(
            name = "Knight Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.knight_soulstone,
            cookieCard = R.drawable.knight_card,
            cookieFaceIcon = R.drawable.knight_face_icon,
            cookieFullArt = R.drawable.knight_full_art,
            skillIcon = R.drawable.knight_skill,
            type = DEFENSE,
            position = FRONT,
            rarity = RARE,
            skillDesc = "Charges forward, causing area damage and forcing the enemies to attack himself.",
            skill = "Cavalry Charge",
            gameDescription = "Knight Cookie, a noble warrior in shiny white chocolate armor decorated with milky foam. You can always count on this devoted Cookie, for he will never let you down. If only he could express his true feelings as freely as he wields his lance",
            quote = "I am here to protect Her Highness!",
            cooldown = 13,
            skillStats = "Damage dealt: 260.0% (+ ~3.5% DMG dealt per level) Taunt for 3.0 sec"
        ),
        CookieEntity(
            name = "Blackberry Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.blackberry_soulstone,
            cookieCard = R.drawable.blackberry_card,
            cookieFaceIcon = R.drawable.blackberry_face_icon,
            cookieFullArt = R.drawable.blackberry_full_art,
            skillIcon = R.drawable.blackberry_skill,
            type = MAGIC,
            position = MIDDLE,
            rarity = RARE,
            skillDesc = "The ghosts rush through the enemy formation, striking them several times and increasing the party's Critical Strike Chance.",
            skill = "Ghost Servants",
            gameDescription = "Blackberry Cookie always wears a reserved look, but it would be hard to find a more caring and devoted Cookie. She has been working at one prestigious household for a long time, and is praised for her miraculous ability to do a multitude of tasks in virtually no time! Despite Blackberry Cookie's tightest schedule, she always finds the time to save the life of her venturesome employer. Perhaps, this is her main duty these days.",
            quote = "May I suggest not taking this road...?",
            cooldown = 15,
            skillStats = "15 second base Cooldown Damage dealt: 17.0% base (+0.2% per level) \n+20.0% CRIT% for 8.0 seconds"
        ),
        CookieEntity(
            name = "Devil Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.devil_soulstone,
            cookieCard = R.drawable.devil_card,
            cookieFaceIcon = R.drawable.devil_face_icon,
            cookieFullArt = R.drawable.devil_full_art,
            skillIcon = R.drawable.devil_skill,
            type = MAGIC,
            position = MIDDLE,
            rarity = RARE,
            skillDesc = "Summons the Devilish Rune dealing damage over time to enemies standing on it and reducing their ATK SPD and MOV SPD.",
            skill = "Devilish Rune",
            gameDescription = "Devil Cookie is mysterious in many ways. This Cookie might look hot and spicy but tastes like fizzy cola. According to a trustworthy source, they are made of bat extract and a few drops of carbonated beverage. Little trickster's ultrasonic powers allow them to see Cookie souls invisible to the others. Devil Cookie is also capable of summoning the horribly powerful and tremendously sugary Devilish Rune straight from the fiery lower trays of existence.",
            quote = "Don't worry, I won't hurt you... or will I?",
            cooldown = 7,
            skillStats = "Total Periodic DMG: 115.0% (+1.55% DMG per level)\n" +
                    "-15.0 % ATK SPD above the Rune\n" +
                    "-15.0 % MOV SPD above the Rune"
        ),
        CookieEntity(
            name = "Adventurer Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.adv_soulstone,
            cookieCard = R.drawable.adv_card,
            cookieFaceIcon = R.drawable.adv_face_icon,
            cookieFullArt = R.drawable.adv_full_art,
            skillIcon = R.drawable.adv_skill,
            type = AMBUSH,
            position = MIDDLE,
            rarity = RARE,
            skillDesc = "They're not expecting it! Adventurer Cookie appears behind the farthest enemy, attacks with a rope and incapacitates them.",
            skill = "Rope Master",
            gameDescription = "For a long time, there have been only rumors of Adventurer Cookie's travels far and wide beyond the Witch's island, but now he's back and ready to guide the other Cookies into uncharted territories of a new exciting world. Adventurer Cookie had got quite a lot of stories to tell: about legendary dragons, kingdoms in ruins, but... So little time! His thirst for the unknown is unquenchable, and he will continue to roam the wide world as long as possible",
            quote = "A whole world to explore!",
            cooldown = 12,
            skillStats = "Damage dealt: 410.0% (+5.13-5.14% DMG per level)\n" +
                    "Shackles: 4.0 sec"
        ),
        CookieEntity(
            name = "Pancake Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.pan_soulstone,
            cookieCard = R.drawable.pac_card,
            cookieFaceIcon = R.drawable.pan_face_icon,
            cookieFullArt = R.drawable.pan_full_art,
            skillIcon = R.drawable.pan_skill,
            type = AMBUSH,
            position = REAR,
            rarity = RARE,
            skillDesc = "Flies forward, throwing acorns at the enemies causing wide area damage and increasing the party's Attack Speed.",
            skill = "Take an Acorn!",
            gameDescription = "Browned to perfection, the ever-energetic Pancake Cookie is cute to the extreme. And he knows it! He even added a piece of butter on top of his head to look even more adorable. This sweet and innocent Cookie's favorite thing in the world is Acorn Jellies. When he sees one, he'll use the full extent of his cuteness to get his hands on it. You may try to resist his charms, but he'll get that Acorn Jelly from you one way or another!",
            quote = "Let's play! Let's fly!\t",
            cooldown = 15,
            skillStats = "Damage dealt: 40.0% (+0.5% DMG per level)\n" +
                    "+20.0% ATK SPD for 6.0 sec"
        ),
        CookieEntity(
            name = "Alchemist Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.alch_soulstone,
            cookieCard = R.drawable.alch_card,
            cookieFaceIcon = R.drawable.alch_face_icon,
            cookieFullArt = R.drawable.alch_full_art,
            skillIcon = R.drawable.alch_skill,
            type = BOMBER,
            position = MIDDLE,
            rarity = RARE,
            skillDesc = "Begins researching a Poison formula that, thrown at the enemies, causes damage over time. Alchemist Cookie's research consists of three stages: the higher the stage, the wider the effect area, and the greater the amount of damage. After reaching the third stage, the Cookie throws the formula automatically.",
            skill = "Unstable Formula",
            gameDescription = "Made from the freshest of grapes, the fruit of the gods, this smart Cookie cares only about one thing: Research! She is always doing wild calculations, trying to figure out how to transform the elements. And she knows that being lazy or sitting idly by will achieve nothing. In order to acquire something of value, one must give something of value in return—that's Alchemist Cookie's theory, at least.",
            quote = "Just follow my instructions!",
            cooldown = 16 ,
            skillStats = "16 second base Cooldown\n" +
                    "Stage 1: 53.3% DMG, 9.5% Poison DMG every sec over 10 sec\n" +
                    "2: 108.1% DMG, 19.5% Poison DMG every sec over 10 sec\n" +
                    "Stage 3: 163% DMG, 29.5% Poison DMG (+0.4% DMG per level) every sec over 10 sec"
        ),
        CookieEntity(
            name = "Gumball Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.gum_soulstone,
            cookieCard = R.drawable.gum_card,
            cookieFaceIcon = R.drawable.gum_face_icon,
            cookieFullArt = R.drawable.gum_full_art,
            skillIcon = R.drawable.gum_skill,
            type = BOMBER,
            position = MIDDLE,
            rarity = RARE,
            skillDesc = "Boom-boom-boom! The cookie shoots three bubble gum charges at the enemies, each causing area damage and decreasing the enemies' Attacking Speed.",
            skill = "Art-illery",
            gameDescription = "The hard outside and soft inside of a gumball were separated, then evenly mixed into the batter and—ta-da!—Gumball Cookie was born! If you smell a sweet and sour aroma, Gumball Cookie is nearby! He is out on a mission to transform the dull world into a fun and colorful playground with his gumball cannon! Walls? Ceiling? Obstacles? Everything is a canvas for this mischievous cookie! It is said that he angered the Witch by coloring her oven the day after he was born. He is frowned upon sometimes for his turbulent nature, but he will stop at nothing to share his art with the world.",
            quote = "Let's add some color here! Woohoo!",
            cooldown = 13,
            skillStats = "Damage dealt: 264.0% (+3.6% DMG dealt per level)\n" +
                    "-20.0% ATK SPD for 6 seconds"
        ),
        CookieEntity(
            name = "Carrot Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.carrot_soulstone,
            cookieCard = R.drawable.carrot_card,
            cookieFaceIcon = R.drawable.carrot_face_icon,
            cookieFullArt = R.drawable.carrot_full_art,
            skillIcon = R.drawable.carrot_skill,
            type = SUPPORT,
            position = MIDDLE,
            rarity = RARE,
            skillDesc = "Pulls the hardest carrots from the ground and shoots them at the enemy, causing area damage and increasing the party's Defense. Carrots collected after an attack restore some HP.",
            skill = "Carrot Harvest",
            gameDescription = "The sun is burning! Lumps of rich black soil are being tossed right and left! Sweat is flowing! Carrot Cookie is having yet another pleasant day of working in the fields! This genius farmer knows the secret of growing delicious giant vegetables out of the smallest seeds. She even had to fix the roof of her house after one of her green giants had grown a bit too big. But for Carrot Cookie there's no such thing as \"too big!\" And when it's harvest season, the Cookie forgets about everything but her farm! Come rain or shine, her crops always flourish!",
            quote = "Time to farm!",
            cooldown = 19 ,
            skillStats = "Damage dealt: 138.0% (+ ~0.2 per level)\n" +
                    "Each carrot restores HP equal to 20.1% of ATK\n" +
                    "+15.0% DEF for 6.0 seconds"
        ),
        CookieEntity(
            name = "Onion Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.onion_soulstone,
            cookieCard = R.drawable.onion_card,
            cookieFaceIcon = R.drawable.onion_face_icon,
            cookieFullArt = R.drawable.onion_full_art,
            skillIcon = R.drawable.onion_skill,
            type = SUPPORT,
            position = MIDDLE,
            rarity = RARE,
            skillDesc = "Doesn't perform Regular Attacks frozen in fear. Use this skill to let out a deafening cry, causing wide area damage and lowering the enemy's Attack Power. The higher the fear level, the more powerful the skill.",
            skill = "Unstoppable Tears",
            gameDescription = "Your eyes will start to water if you get too close to this onion-based Cookie! And once she starts crying, she cannot stop. Mainly because her tears consist of onion juice that makes her cry even more. Poor thing, she is terrified of ghosts and weeps when scared. Perhaps one day, she'll realize why her surroundings sometimes become ghostly, and clocks suddenly start ticking backwards.",
            quote = "There aren't any ghosts here, are there?",
            cooldown = 20,
            skillStats = "Damage dealt: 67.0% for 1 stack (+0.9% DMG per level)\n" +
                    "Up to +671.0% DMG for 10 stacks (+ ~9.2% DMG per level)\n" +
                    "-10.0% ATK for 6.0 sec"
        ),
        CookieEntity(
            name = "Clover Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.clover_soulstone,
            cookieCard = R.drawable.clover_card,
            cookieFaceIcon = R.drawable.clover_face_icon,
            cookieFullArt = R.drawable.clover_full_art,
            skillIcon = R.drawable.clover_skill,
            type = SUPPORT,
            position = REAR,
            rarity = RARE,
            skillDesc = "Tough times are when music is needed the most. The Cookie plays a soothing song, removing all debuffs from party members and applying a buff that slowly restores their HP.",
            skill = "Bard's Song",
            gameDescription = "A brightly sunlit summer glade covered with soft clovers. A forest brook murmuring gently not afar. A delicate breeze whispering secrets to your ear. A joyful bustle of a Cookie crowd. Clover Cookie wanders the land in search of inspiration for his poetry of the everyday. Two crunchy feet and a long road ahead, the old grass-woven lute behind his back, and someone to sing a song to—what else is needed to be happy? Sing along, and Clover Cookie's ballad will flow far away, over the forests and ridges of the Cookie World.",
            quote = "May luck follow you in your adventures...",
            cooldown = 17,
            skillStats = "17 second base Cooldown\n" +
                    "Healing: 12% of ATK every 1.0 sec over 5.0 sec (+0.17% per level)\n" +
                    "Purify: all debuff effects"
        ),
        CookieEntity(
            name = "Custard Cookie III",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.custard_soulstone,
            cookieCard = R.drawable.custard_card,
            cookieFaceIcon = R.drawable.custard_face_icon,
            cookieFullArt = R.drawable.custard_full_art,
            skillIcon = R.drawable.custard_skill,
            type = HEALING,
            position = REAR,
            rarity = RARE,
            skillDesc = "Heals two Cookies with the lowest HP and also casts a short-living Shield absorbing damage. 'Cause that's what kings do!",
            skill = "King's Favor",
            gameDescription = "Even before the custard on his head started to take shape, this little Cookie dreamed of becoming a glorious king, worthy of the title borne by the greatest rulers of the past. Custard Cookie III, as he prefers to call himself, may not rule anything yet, but looking at how active he is at waving his scepter and giving orders, it is only a matter of time before he sits on a real throne. And his determination is remarkable! Made of simple colored paper, his royal regalia looked so realistic that even the notorious Chilipepperhead.webp Chili Pepper Cookie got confused once! These days, Custard Cookie III is busy recruiting supporters to witness his future crowning. Perhaps you could become one of them?",
            quote = "Ah, another of my faithful servants! You may speak!",
            cooldown = 16 ,
            skillStats = "Healing: 113.0% of ATK (+2.15% per level)\n" +
                    "Shield: absorbs 10.0% of max HP for 3.0 sec"
        ),
        CookieEntity(
            name = "Dark Choco Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.choco_soulstone,
            cookieCard = R.drawable.choco_card,
            cookieFaceIcon = R.drawable.choco_face_icon,
            cookieFullArt = R.drawable.choco_full_art,
            skillIcon = R.drawable.choco_skill,
            type = CHARGE,
            position = FRONT,
            rarity = EPIC,
            skillDesc = "Strikes the ground with his great sword, inflicting chain lightning upon the enemies. Those unfortunate, affected by this dark lightning suffer from great damage and lowered Defense.",
            skill = "Sword of Darkness",
            gameDescription = "Long ago, this Cookie stepped into the world of Darkness to become a hero, but fate had a different plan: Dark Choco Cookie was unfortunate enough to happen upon the forbidden Strawberry Jam Sword. As soon as the would-be hero grasped the weapon, the dark power of the magic sword took over. From that moment on, Dark Choco Cookie's life changed forever. Now, dark clouds and thunderstorms follow this ill-fated Cookie, feared by all. It is said that Dark Choco Cookie is still fighting against the magic sword's control",
            quote = "When I woke up, darkness was around me.",
            cooldown = 13,
            skillStats = "Damage dealt: 316.6% (+1.9-2% DMG per level)\n" +
                    "-20.0% DEF for 7.0 sec"
        ),
        CookieEntity(
            name = "Purple Yam Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.yam_soulstone,
            cookieCard = R.drawable.yam_card,
            cookieFaceIcon = R.drawable.yam_face_icon,
            cookieFullArt = R.drawable.yam_full_art,
            skillIcon = R.drawable.yam_skill,
            type = CHARGE,
            position = FRONT,
            rarity = EPIC,
            skillDesc = "Ravages the battlefield in a deadly Purple Tornado, causing area substantial damage over time.",
            skill = "Purple Tornado",
            gameDescription = "Purple Yam Cookie was baked in extreme temperatures again and again until the heat finally got to his head. Ever since, Purple Yam Cookie has been in an angered state (to say the least!) that's why we advise being extremely cautious around him. When the wrath kicks in, this Cookie begins to crush and smash the surroundings in a dangerous tornado of rage. And as if that wasn't enough, Purple Yam Cookie is always eager to fight someone! The Cookie claims that no one has suffered in the \"flames of hell\" more than him, but... it seem like no one has had a chance to tell him that other Cookies went through the Witch's oven too...",
            quote = "Fiery WRATH!",
            cooldown = 12,
            skillStats = "Damage dealt: 54.0% (+0.7% DMG per level)"
        ),
        CookieEntity(
            name = "Werewolf Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.wolf_soulstone,
            cookieCard = R.drawable.wolf_card,
            cookieFaceIcon = R.drawable.wolf_face_icon,
            cookieFullArt = R.drawable.wolf_full_art,
            skillIcon = R.drawable.wolf_skill,
            type = CHARGE,
            position = FRONT,
            rarity = EPIC,
            skillDesc = "Takes his wolf form, causing area damage. In the wolf form, Werewolf Cookie has increased HP, becomes resistant to interrupting effects, and does more powerful double-strike regular attacks. Targets hit by double strikes may be stunned.",
            skill = "Transformation",
            gameDescription = "Together with a great amount of pepper, a wolf hair had fallen into the cookie dough by accident. Now, whenever Werewolf Cookie feels scared or threatened, his wolf instinct kicks in to transform him into a feral beast. A long time ago, when a friend was in great peril, Werewolf Cookie managed to save them by transforming, at a cost. With his true nature revealed to the whole town, he was cast away out of fear and has been living alone in the forests since. With so much pain inside, this Cookie tastes bitter and salty (of tears). Don't ask about his scar or try to get close, as he will only push you away...",
            quote = "Get away! Or you'll get hurt...",
            cooldown = 11,
            skillStats = "Transformation: +20.0% HP for 10.0 sec\n" +
                    "Damage dealt: 206.9%\n" +
                    "Transformation: 77.0% (+1.04% DMG per level)\n" +
                    "Transformation: 20% chance of Stun for 1 sec with each regular attack"
        ),
        CookieEntity(
            name = "Kumiho Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.kumiho_soulstone,
            cookieCard = R.drawable.kumiho_card,
            cookieFaceIcon = R.drawable.kumiho_face_icon,
            cookieFullArt = R.drawable.kumiho_full_art,
            skillIcon = R.drawable.kumiho_skill,
            type = CHARGE,
            position = FRONT,
            rarity = EPIC,
            skillDesc = "Transforms into a Cookie and causes area damage and charming nearby enemies, while charming them and reducing their DEF. Afterward, fires a powerful Fox Spirit Flame up to 5 enemies near Kumiho Cookie and turns back into marshmallow fox.",
            skill = "Somersault",
            gameDescription = "A fox-shaped marshmallow wished to become a Cookie so much that it mastered a spell to shapeshift into a Cookie by surviving only on flour and butter for 999 days. As a result, she can now disguise herself as a seductive and attractive Cookie. Anyone who catches even a glimpse of her will instantly fall in love. Perhaps she's dazzling them with her nine tails.",
            quote = "What's your name, cutie pie?",
            cooldown = 14,
            skillStats = "Single hit DMG: 245.4% (+3.06-3.07% DMG per level)\n" +
                    "Transformation for 12.0 sec\n" +
                    "Charmed: 2.0 sec\n" +
                    "-20.0% DEF for 8.0 sec\n" +
                    "Fox Spirit Flame DMG: 251.2%"
        ),
        CookieEntity(
            name = "Red Velvet Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.velvet_soulstone,
            cookieCard = R.drawable.velvet_card,
            cookieFaceIcon = R.drawable.velvet_face_icon,
            cookieFullArt = R.drawable.velvet_full_art,
            skillIcon = R.drawable.velvet_skill,
            type = CHARGE,
            position = FRONT,
            rarity = EPIC,
            skillDesc = "Face the might of the Cakes! This Cookie grasps the rearmost enemy, brings it in front of the Cookie squad, dealing great damage and stunning them for a short time. Cannot be interrupted.",
            skill = "Crimson Hand",
            gameDescription = "OBEY ME, MY BEASTS!\" Red Velvet Cookie's order, like a thunderbolt, rolls over the battlefield. \"FALL IN!\" And the horde of snarling Cake Monsters obediently assumes a dreadful battle formation. The crimson general personally leads his legion into battle, sowing fear with his clenched cake fist and his black eye gleaming with the dark fire of battle fervor. The battle-hardened warrior will see his mission to its end with precision and relentlessness. \"UNLEASH CHAOS, MY BEASTS!\" he roars as the battle begins. Adding silently: \"But please, come back alive...",
            quote = "TO BATTLE!",
            cooldown = 15,
            skillStats = "Single hit DMG: 835.0% (+10%-10.1% per level)\n" +
                    "Stun: 5.0 sec"
        ),
        CookieEntity(
            name = "Raspberry Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.ras_soulstone,
            cookieCard = R.drawable.ras_card,
            cookieFaceIcon = R.drawable.ras_face_icon,
            cookieFullArt = R.drawable.ras_full_art,
            skillIcon = R.drawable.ras_skill,
            type = CHARGE,
            position = FRONT,
            rarity = EPIC,
            skillDesc = "Quickly dashes at the enemy with the highest ATK and continuously stabs them. The attack briefly reduces the hit target's ATK for a while. While Raspberry Cookie is using her skill, she will be more resistant to interrupting effects.",
            skill = "Raspberry Reprise",
            gameDescription = "Amidst the generous raspberry fields illuminated by the Hollyberry Kingdom's hot sun, proudly stands the grand Chateau Raspberry. In this place of history and culture, Raspberry Cookie was born and raised. Just like her great ancestors, she began fencing even before she learned the intricacies of aristocratic etiquette and rhetoric. Raspberry Cookie has been molded to become the heir and defender of the noble House Raspberry, sworn to protect its legacy. With her sword in hand, elegantly glazed hair fluttering in the summer breeze, and the proud House Raspberry banners behind her back, Raspberry Cookie is about to claim another victory from the clasp of fate.",
            quote = "Fear the scarlet crest!\t",
            cooldown = 14 ,
            skillStats = "Single (9) hit DMG: 42.0% (+0.56% DMG per level)\n" +
                    "DMG of final hit: 334.0% (+4.54% DMG per level)\n" +
                    "ATK Reduction: -40.0% for 3.0 sec"
        ),
        CookieEntity(
            name = "Mala Sauce Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.mala_soulstone,
            cookieCard = R.drawable.mala_card,
            cookieFaceIcon = R.drawable.mala_face_icon,
            cookieFullArt = R.drawable.mala_full_art,
            skillIcon = R.drawable.mala_skill,
            type = CHARGE,
            position = FRONT,
            rarity = EPIC,
            skillDesc = "Strikes the ground with her mace, rupturing it and dealing area damage. Spicy Mala Sauce lava will erupt from the crack and apply the Burn debuff dealing periodic damage to the enemies. In addition, this skill increases CRIT% of the two allies with the highest CRIT% stat.",
            skill = "Spicy Mala Strike",
            gameDescription = "The blistering heat of the Dragon's Valley seems inhospitable to all forms of life. That is... until you get to know the spicy Cookies of the Mala Tribe. The entire tribe is unyieldingly spicy, but none come close to Mala Sauce Cookie with her mind-numbing, fiery taste! Her strength knows no bounds: a simple tap on a boulder shatter it to pieces, a full swing of her Morning Star Anise triggers a massive whirlwind. Due to her fierce determination to protect the tribe, she was the only cookie who succeeded in the dreaded Trial of the Dragon. It's no wonder that she is destined to be the future leader! Despite the twists and turns with her first adventure outside of the village, if she can captivate the spicy denizens of the Mala Tribe, the outside world doesn't stand a chance!",
            quote = "Time to spice things up!",
            cooldown = 15,
            skillStats = "+25.0% CRIT% for 8.0 sec\n" +
                    "Mace DMG: 9.0% (+0.1-0.2% DMG per level)\n" +
                    "Lava Burst DMG: 15.7% (+0.2-0.3% DMG per level)\n" +
                    "Burn: 27.6% DMG every 0.5 sec for 6 sec (+0.3-0.4% DMG per level)"
        ),
        CookieEntity(
            name = "Tea Knight Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.tea_soulstone,
            cookieCard = R.drawable.tea_card,
            cookieFaceIcon = R.drawable.tea_face_icon,
            cookieFullArt = R.drawable.tea_full_art,
            skillIcon = R.drawable.tea_skill,
            type = CHARGE,
            position = FRONT,
            rarity = EPIC,
            skillDesc = "Inflicts damage to the nearest enemy (targets Cookies first) and leads the battle on, providing a buff for his allies. There are several kinds of available buffs; each kind is applied to the Cookie meeting the required conditions. Whenever an allied Cookie is defeated, the Wrath of the Commander effect is triggered. Wrath of the Commander cannot be dispelled and stacks up to four times. At maximum stacks, Tea Knight Cookie will become resistant to interrupting effects.",
            skill = "Battlemaster",
            gameDescription = "There was a time when dreadful dragons ruled the skies. Their fire ravaged entire kingdoms, and their claws crumbled countless Cookies. An order of knight in shiny silver armor, infused with courage and battle prowess, swore to put an end to this threat. Led by Tea Knight Cookie, the knights courageously opposed the gargantuan monsters through fire and jam an remained in history. But even the most fragrant tea loses its aroma--with time, the glorious tale of the knight became a legend, a mere echo of the past. Tea Knight Cookie, the fearless hero, was forgotten by those he strove to protect. Now sadness and regret shadow his scar-ridden face. Perhaps he wanted to be forgotten...? Yet... when he reminisces the battles he fought side by side with his comrades of old, a spark lights up in his eyes: the flame within him still burns bright!",
            quote = "Never forget your oaths, young one.",
            cooldown = 18,
            skillStats = "Single hit DMG: 542.4% (+7.38% DMG per level)\n" +
                    "ATK: +6.0% for the two Cookies with the highest ATK for 8.0 sec\n" +
                    "CRIT%: +12.0% for the two Cookies with the highest CRIT% for 8.0 sec\n" +
                    "Per Wrath of the Commander stack: CRK-atkup.png ATK +50.0%, ATK SPD +20.0%\n" +
                    "Fourth stack: ATK +100.0%,  ATK SPD +150.0%"
        ),
        CookieEntity(
            name = "Crunchy Chip Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.crunchy_soulstone,
            cookieCard = R.drawable.crunchy_card,
            cookieFaceIcon = R.drawable.crunchy_face_icon,
            cookieFullArt = R.drawable.crunchy_full_art,
            skillIcon = R.drawable.crunchy_skill,
            type = CHARGE,
            position = FRONT,
            rarity = EPIC,
            skill = "Wolf Squadron",
            skillDesc = "Crunchy Chip Cookie's regular attacks leave the Claw Mark on the enemy with the highest ATK. Upon using the skill, the Cookie charges towards the enemies, slamming them and summoning his Cream Wolf. When Crunchy Chip Cookie is defeated, the Cream Wolf becomes enraged and continues fighting alone. In this state, the Cream Wolf becomes resistant to incapacitating effects. If Crunchy Chip Cookie is revived, he will hop back onto the Cream Wolf. Crunchy Chip Cookie and his wolves are less affected by Knockbacks and Flying.",
            gameDescription = "One howl is all it takes to prep the Cream Wolves for battle, even in the middle of the night. Led by Crunchy Chip Cookie, this elite squad protects the frozen borders of the Dark Cacao Kingdom. The squad captain may be famous for his quick temper—which is not surprising given the sheer amount of the crunchiest choco chips in his dough—but rest assured: Crunchy Chip Cookie is loyal and reliable, just like his white-maned wolf companion. His oath to his king has kept him and his comrades persevering through piercing winds and snowstorms to ensure the kingdom's safety from the Licorice Sea. No other squadron stands a chance against these ferocious warriors that race through the mountains on the back of their wolves, defeating every monster they come across. Another serene morning in the Dark Cacao Kingdom; perhaps, we have to thank Captain Crunchy Chip Cookie for it!",
            quote = "Owooo! Guess who's here first! Ha ha!",
            cooldown = 15,
            skillStats = "Tamer: receives 25.0% of Summoned Creature buffs\n" +
                    "Single hit DMG: 88.6% (+1.2% DMG per level) + 185.0% of CRIT%\n" +
                    "Summoned Wolf: 70.0% of ATK, 60.0% of DEF, 85.0% of HP, 100.0% of CRIT%\n" +
                    "Tamed Wolf: 102.9% (+1.4% ATK per level) of ATK, 138.0% of DEF, 230.0% of HP, 100.0% of CRIT%\n" +
                    "Claw Mark: 30.0 sec duration, activated upon 3 stacks\n" +
                    "Claw Mark: removes buffs, ATK SPD -25.0% for 18.0 sec (stacks up to 2 times), 217.0% DMG"
        ),
        CookieEntity(
            name = "Madeleine Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.mad_soulstone,
            cookieCard = R.drawable.mad_card,
            cookieFaceIcon = R.drawable.mad_face_icon,
            cookieFullArt = R.drawable.mad_full_art,
            skillIcon = R.drawable.mad_skill,
            type = DEFENSE,
            position = FRONT,
            rarity = EPIC,
            skillDesc = "Calls upon the Celestial Light that allows performing ranged area attacks instead of regular attacks, While under the Celestial Light, Madeleine Cookie receives a buff making him immune to debuffs.",
            skill = "Commander's Honor",
            gameDescription = "An offspring of a noble Cookie family from a peaceful republic across the ocean, Madeleine Cookie, armed with his family's influence and shiny new armor, is already the Commander of a knight order. On the day of his Commander's Oathtaking, Madeleine Cookie dedicated himself to the Divine and was granted the Sword and Shield of Radiant Light, which he prizes the most among his numerous possessions. The glorious Knight Commander's usual duties included trotting around the city on his snow-white sugar horse or letting his heavy cape flutter dramatically on the wind during his sparring sessions. Not too long ago, the heroic Madeleine Cookie set on a quest in search of the legendary Jam of Souls capable of granting Cookies eternal life! Will the noble paladin's first campaign bear fruit?",
            quote = "The Divine smiles upon me!\t",
            cooldown = 13,
            skillStats = "Ranged attack: 10.0 sec\n" +
                    "Immunity for 10.0 sec\n" +
                    "Single hit DMG: 108.0% (+1.45% DMG per level)"
        ),
        CookieEntity(
            name = "Milk Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.milk_soulstone,
            cookieCard = R.drawable.milk_card,
            cookieFaceIcon = R.drawable.milk_face_icon,
            cookieFullArt = R.drawable.milk_full_art,
            skillIcon = R.drawable.milk_skill,
            type = DEFENSE,
            position = FRONT,
            rarity = EPIC,
            skillDesc = "Stands at the front line, causing area damage, and taunts the enemies, forcing them to attack himself. While the skill is active, Milk Cookie's Divine Milk Shield decreases incoming damage.",
            skill = "Noble Sacrifice",
            gameDescription = "Everything the light touches, let there be peace! Milk Cookie made a divine oath to protect the world from all evil. When raising up the Healing Milk Mace, a splendid glow soars to the skies and bathes the world in light. The forces of evil flee in terror at the sight of the Divine Milk Shield. Milk Cookie has faced many foes, and yet his resolve remains unsullied by corruption and despair. Even on the brink of exhaustion, this selfless and noble protector will cast a blessing of protection for other Cookies first.",
            quote = "Darkness be gone!",
            cooldown = 12,
            skillStats = "-50.0% DMG for 5.0 seconds\n" +
                    "Damage dealt: 219.0% (+3% DMG per level)\n" +
                    "Taunt for 5.0 seconds"
        ),
        CookieEntity(
            name = "Strawberry Crepe Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.straw_soulstone,
            cookieCard = R.drawable.straw_card,
            cookieFaceIcon = R.drawable.straw_face_icon,
            cookieFullArt = R.drawable.straw_full_art,
            skillIcon = R.drawable.straw_skill,
            type = DEFENSE,
            position = FRONT,
            rarity = EPIC,
            skillDesc = "Uses the giant crepe arms to cause area damage. Reduces DMG received by two allies (targets Cookies first) with the lowest Max HP.",
            skill = "Crepe Thrust",
            gameDescription = "Sweet strawberry cream, crispy waffles, and chubby fresh strawberries—is there a cuter combination? Meet Strawberry Crepe Cookie with an unyielding sparkle of curiosity in their eyes. And this curiosity is a force to be reckoned with: Strawberry Crepe Cookie will stop at nothing to find an answer to every question! Having grown up with Wafflebots, this Cookie preferred tinkering with robotic parts to playing with toys. This little genius's cute waffle headset is a tiny engineering marvel on its own. But don't touch it! Or you risk witnessing a change from the cute Strawberry Crepe Cookie to the furious one.",
            quote = "Cookies are too weak. BORING!",
            cooldown = 15,
            skillStats = "Single hit damage: 330.0% (+4.1-4.2% DMG per level)\n" +
                    "+50.0% DMG Resist over 8.0 sec"
        ),
        CookieEntity(
            name = "Moon Rabbit Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.moon_soulstone,
            cookieCard = R.drawable.moon_card,
            cookieFaceIcon = R.drawable.moon_face_icon,
            cookieFullArt = R.drawable.moon_full_art,
            skillIcon = R.drawable.moon_skill,
            type = DEFENSE,
            position = FRONT,
            rarity = EPIC,
            skill= "Giant Rice Cake Bunny",
            skillDesc = "After transforming into a Giant Rice Cake Bunny, Moon Rabbit Cookie jumps up and down, dealing DMG to all enemies. Enemies hit with this skill will be marked with a Healing Rice Cake, and when the marked enemies are defeated, the Healing Cake will restore the HP of all allies. The healing amount will depend on the target. While Moon Rabbit Cookie is using her skill, she will be more resistant to interrupting effects.",
            gameDescription = "Fresh rice harvested from the happy soils of the Cookie World was used for baking the happy Moon Rabbit Cookie. This Cookie's chubby cheeks are always filled with sweet rice cakes. And while some may think it's cute, her craving for more rice cakes might be one of the strongest forces of the Universe. That craving can even become so strong that she might turn into a giant Rice Cake Bunny, and—oh boy!—you'd better keep your distance because she is going to wreak SWEET HAVOC. A group of particularly brave Cookies once tried to keep the giant Rice Cake Bunny in check by grabbing each other's hands and building a circle around her. Ever since, the Cookies have kept a tradition of holding hands and going around in circles under the full moon",
            quote = "Fummoon in the sky, and in ma tummy!",
            cooldown = 14,
            skillStats = "Single hit DMG: 127.9 % (+1.7% per level)\n" +
                    "Self-healing: 160.0 % of ATK\n" +
                    "Healing Rice Cake: heals all allies if the target is defeated within 10.0 sec\n" +
                    "Healing: 253.0% of ATK (if Healing Cake's target is a Cookie)\n" +
                    "Healing: 24.2% of ATK (if Healing Cake's target is not a Cookie)"
        ),
        CookieEntity(
            name = "Cocoa Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.coco_soulstone,
            cookieCard = R.drawable.coco_card,
            cookieFaceIcon = R.drawable.coco_face_icon,
            cookieFullArt = R.drawable.coco_full_art,
            skillIcon = R.drawable.coco_skill,
            type = DEFENSE,
            position = FRONT,
            rarity = EPIC,
            skillDesc = "Cocoa Cookie jumps into a giant cocoa mug and happily spins around for a given time, attacking the enemies. At the same time, Cocoa Cookie restores the HP for all allied Cookies except for summoned creatures and makes them immune to stunning. While Cocoa Cookie is using her skill, she will briefly become resistant to interrupting effects. Cocoa Cookie's regular attack will heal 3 allies (targets Cookies first) with the lowest HP.",
            skill = "Cocoa is Love",
            gameDescription = "Even if her dough is 80% cocoa, she's always sipping hot cocoa, even during the summer time. Her marshmallow hat is so deliciously sweet, she needs to resist the temptation of taking a chunk out of it and dipping it into her cup. Her plump smooth cheeks just add to her charm! When she indulges in a freshly prepared cup of cocoa, all her worries melt away",
            quote = "How about a cup of cocoa?",
            cooldown = 15,
            skillStats = "Single hit DMG: 41.7% (+0.57% per level)\n" +
                    "Healing: 42.8% (+0.58% per level) of ATK\n" +
                    "Stun Immunity: 8.0 sec"
        ),
        CookieEntity(
            name = "Wildberry Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.wild_soulstone,
            cookieCard = R.drawable.wild_card,
            cookieFaceIcon = R.drawable.wild_face_icon,
            cookieFullArt = R.drawable.wild_full_art,
            skillIcon = R.drawable.wild_skill,
            type = DEFENSE,
            position = FRONT,
            rarity = EPIC,
            skillDesc = "Wildberry Cookie unleashes his Battle Rage, dealing more powerful attacks and activating his Wild buff that cannot be dispelled. At the end of the Battle Rage mode, Wildberry Cookie musters all his strength, dealing an uppercut and a final blow. The Wild buff will stack with each hit Wildberry Cookie receives: the more stacks he has, the more powerful his final blow's DMG will be. While Wildberry Cookie is dealing an uppercut and his final blow, he will become resistant to interrupting effects. Being a large Cookie, Wildberry Cookie is less affected by Knockback or Flying.",
            skill = "Wild Punch",
            gameDescription = "Filled to the brim with wild tropical berries, Wildberry Cookie's ardent loyalty to the Hollyberry Kingdom is unquestionable. And the brightly gleaming jewel embedded into his mighty gauntlet is proof! Young Wildberry Cookie once roamed the ramshackle alleys of the Hollyberry capital until an unexpected savior offered him a helping hand. Insidious whispers have been following this knight of few words ever since: they claim he is prone to solving problems with brute force, but these rumors cannot be farther from the truth. Wildberry Cookie has sworn to do whatever it takes to protect his kingdom and its royal dynasty! Even though sometimes what it takes is serving generous amounts of berry juice!",
            quote = "For the Hollyberry Kingdom!",
            cooldown = 10,
            skillStats = "Single Hit DMG: 423.5% + Stun 1.3 Sec\n" +
                    "Extra DMG to Knockback-resisting enemies: +100.0%\n" +
                    "Wild: +35.3% to final blow for every hit, up to 30 stacks\n" +
                    "DMG Resist: +15.0% to all allies during Battle Rage\n" +
                    "Uppercut DMG: 19.3% (+0.263% per level)\n" +
                    "Final blow DMG: 141.6% (+1.93% per level) + Wild's extra DMG\n" +
                    "Final blow stun: 2.3 sec"
        ),
        CookieEntity(
            name = "Licorice Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.lic_soulstone,
            cookieCard = R.drawable.lic_card,
            cookieFaceIcon = R.drawable.lic_face_icon,
            cookieFullArt = R.drawable.lic_full_art,
            skillIcon = R.drawable.lic_skill,
            type = MAGIC,
            position = MIDDLE,
            rarity = EPIC,
            skillDesc = "Summons a powerful Black Lightning and Licorice Servants. The potent spell briefly increases the party's Defense. Licorice Servants are resistant to certain movement interrupting effects. If the skill is used before the summoned Licorice Servants disappear, new additional Licorice Servants will be summoned.",
            skill = "Licorice Servants",
            gameDescription = "With a great portion of the blackest licorice extract in his dough and a grim-looking scythe, this Cookie is up to no good. From a young age, Licorice Cookie dreamed of becoming a wizard but never received the recognition he so rightfully deserved. Eventually, he turned to the forbidden arts of Black Magic. With time, Licorice Cookie assembled a small army of Chewy Licorice Servants raised to do his bidding. On his dark path, he met Dark enchantress head.png Dark Enchantress Cookie. The might of the sorceress astonished Licorice Cookie, and it didn't take long before he swore his allegiance. Now, the Cookie is working flat out to earn his new mistress's favor. And it seems like Dark Enchantress Cookie is not easily pleased, as Licorice Cookie's diary filled with everyday rants and complaints could fill up a library.",
            quote = "It's unwise to get in my way... Hehe!",
            cooldown = 14,
            skillStats = "Damage dealt: 239.0% (+3.3% DMG per level)\n" +
                    "Summons Licorice Servants with 5% ATK, 150% DEF, and 50% HP\n" +
                    "+20.0% DEF for 7.0 seconds"
        ),
        CookieEntity(
            name = "Snow Sugar Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.snow_soulstone,
            cookieCard = R.drawable.snow_card,
            cookieFaceIcon = R.drawable.snow_face_icon,
            cookieFullArt = R.drawable.snow_full_art,
            skillIcon = R.drawable.snow_skill,
            type = MAGIC,
            position = MIDDLE,
            rarity = EPIC,
            skillDesc = "Waves the Snow Sugar Wand to summon the Snow King that causes a snowstorm, dealing area damage over time. Frozen enemies suffer from lowered Attack Speed. Snow King is resistant to certain action and movement interrupting effects. While Snow Sugar Cookie is using their skill, they will briefly become resistant to interrupting effects.",
            skill = "Blizzard",
            gameDescription = "Made of snow, sugar, ice, and an unknown secret ingredient, this Cookie was once very lonely, wandering through a vast snowy field. Then one day, Snow Sugar Cookie found a magic wand that could summon snow creatures and wouldn't melt even in the oven. The Cookie quickly learned to summon friends like the Sea Snow Cone and the Great Snow King and was never lonely again.",
            quote = "Hi! Wanna have a snowball fight?",
            cooldown = 20,
            skillStats = "Snow King: 26.0% ATK (+0.35% ATK per level), 125.0% of DEF, 150.0% of HP\n" +
                    "ATK SPD Reduction: -25% within the snowstorm range"
        ),
        CookieEntity(
            name = "Espresso Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.espresso_soulstone,
            cookieCard = R.drawable.espresso_card,
            cookieFaceIcon = R.drawable.espresso_face_icon,
            cookieFullArt = R.drawable.espresso_full_art,
            skillIcon = R.drawable.espresso_skill,
            type = MAGIC,
            position = MIDDLE,
            rarity = EPIC,
            skillDesc = "Precise and even grinding is key for magically delicious coffee! A giant whirlwind inflicts serial area damage to enemies and pulls them to its center. The final burst of damage interrupts skills.",
            skill = "Grinding",
            gameDescription = "Precise temperature, precise quantity of coffee beans, precise roasting time! Everything must be in a precise—impeccably precise—order for the plan to work. Always busy, always on the go—this is the lifestyle of Espresso Cookie. Despite being frequently mistaken for a black mage—yes, sometimes things burn, and smoke—Espresso Cookie can't afford to waste a second on meaningless explanations. Night after night, this pioneer of magic works on perfecting his grind and brew. \"Isn't that too much coffee?\" one might wonder. Well, at least there's always the delightful coffee fragrance in the air!",
            quote = "Yes, I'm here. What now?",
            cooldown = 15,
            skillStats = "80.0% DMG over 7 hits (+0.9-1% DMG per level)\n" +
                    "100.0% DMG with last hit (+1.23-1.25% DMG per level)"
        ),
        CookieEntity(
            name = "Latte Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.latte_soulstone,
            cookieCard = R.drawable.latte_card,
            cookieFaceIcon = R.drawable.latte_face_icon,
            cookieFullArt = R.drawable.latte_full_art,
            skillIcon = R.drawable.latte_skill,
            type = MAGIC,
            position = MIDDLE,
            rarity = EPIC,
            skillDesc = "Conjures a Latte Glyph attracting enemies to its center, dealing damage and silencing them. The Glyph remains on the ground, dealing damage over time and greater damage to enemies in its center.",
            skill = "Care for a Latte?",
            gameDescription = "Coffee or milk... that is the question. Why not both? Latte Cookie's dough was formed with coffee most bitter and acrid, balanced with the creamiest and smoothest blend of milk. With her etched staff in hand, she gracefully draws beautifully patterned Latte Glyphs in the air while daydreaming. But watch out! By chance, one of these Glyphs could be a powerful sigil for a grand spell! During her years as a student, she spearheaded research on the development of Coffee Magic with a rather eccentric aficionado of coffee. Thanks to her efforts, Latte Cookie was granted a professorship at the Parfaedia Magic Institute. You'd think that a professor would be more punctual, especially with their own lectures. But not Latte Cookie! She's more invested in savoring a warm latte before class. Though far from achieving the Professor of the Year Reward, she knows a thing or two about inspiring her students. With her genuine compliments and encouraging smile, Latte Cookie is already the favorite professor of many.",
            quote = "Something on your mind? I can lend you an ear!",
            cooldown = 15 ,
            skillStats = "Single hit DMG: 60.0%\n" +
                    "Inner Latte Glyph DMG: 140.0% DMG total\n" +
                    "Outer Latte Glyph DMG: 105.0% DMG total\n" +
                    "Silenced: 1.0 sec\n" +
                    "Immobilized: 5.0 sec"
        ),
        CookieEntity(
            name = "Mango Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.mango_soulstone,
            cookieCard = R.drawable.mango_card,
            cookieFaceIcon = R.drawable.mango_face_icon,
            cookieFullArt = R.drawable.mango_full_art,
            skillIcon = R.drawable.mango_skill,
            type = MAGIC,
            position = MIDDLE,
            rarity = EPIC,
            skillDesc = "Sends forward a wave of tropical mango juice, inflicting damage to enemies. The fresh, sweet waves also increases the ATK of allies for a short time.",
            skill = "Mango Juice Wave",
            gameDescription = "The sun glistens above the serene palm trees of the Tropical Soda Archipelago. Once you arrive, Mango Cookie will give you a cheerful, hearty welcome making you feel right at home! With ripe mangoes mixed straight into the dough, Mango Cookie is pure-spirited and tenderhearted. Whether it's spending time along the emerald coasts or exploring the islands with his canoe, Mango Cookie makes sure to enjoy life to the fullest. When the sun reaches its peak, sometimes he'll hang up his hammock underneath the shade of the palm trees and take a relaxing nap. When Cookies visit the archipelago, Mango Cookie can't help becoming a hyper chatterbox. Mangoes will ripen by the time he runs out of stories to tell",
            quote = "Any Cookie would fall in love with local views!",
            cooldown = 15,
            skillStats = "Single hit DMG: 57.0% (+0.8% DMG per level)\n" +
                    "+10.0% ATK for 7.0 sec"
        ),
        CookieEntity(
            name = "Squid Ink Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.squid_soulstone,
            cookieCard = R.drawable.squid_card,
            cookieFaceIcon = R.drawable.squid_face_icon,
            cookieFullArt = R.drawable.squid_full_art,
            skillIcon = R.drawable.squid_skill,
            type = MAGIC,
            position = MIDDLE,
            rarity = EPIC,
            skillDesc = "Where did Squid Ink Cookie go? And what is this giant squid doing here?! The monster is about to make anyone flat as a Cookie with a series of rapid slaps dealing area damage.",
            skill = "Ink Tentacle Slap",
            gameDescription = "Squid Ink Cookie came out of the oven not even a little bit crispy. Maybe that's because of all the viscous ink inside! The Cookie was found floating along the seashore, all weak and confused. There is a theory that this Cookie is the legendary treasure-eating sea monster that attacked treasure ships, hungry for more gold. But Squid Ink Cookie can't remember anything of that and spends all the time oozing blackish inky tears.",
            quote = "Not me...",
            cooldown = 16 ,
            skillStats = "Single hit (7) DMG: 35.0% (+0.4-0.5% DMG per level)"
        ),
        CookieEntity(
            name = "Pumpkin Pie Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.pumpkin_soulstone,
            cookieCard = R.drawable.pumpkin_card,
            cookieFaceIcon = R.drawable.pumpkin_face_icon,
            cookieFullArt = R.drawable.pumpkin_full_art,
            skillIcon = R.drawable.pumpkin_skill,
            type = MAGIC,
            position = MIDDLE,
            rarity = EPIC,
            skillDesc = "Pumpkin Pie Cookie's Pompon grows to a giant size, causing area damage. For a given period of time, Giant Pompon inflicts melee area damage up to 3 enemies and applies a non-stackable debuff, decreasing the amount of healing the enemies receive. While on the battlefield, Giant Pompon increases ATK SPD for all allied summoned creatures. Giant Pompon will be more resistant to interrupting effects while performing the first special attack. Also, Pumpkin Pie Cookie can use her decreased first cooldown to use the skill sooner. Pompon is resistant to certain interruption effects.",
            skill = "Pompon, help!",
            gameDescription = "It's Halloween, a time of spooky fun for all ghosts and Cookies. And amidst the Jack-o'-lanterns adorning the streets, stands Pumpkin Pie Cookie watching others dressed up in their costumes. Perhaps it's because she was made of a pumpkin that grew in the shade of an abandoned house, untouched by the sun, but she seems... distant, even though she has a smile on her face. One might try to escape this Cookie's uncanny presence, but there is something eerily captivating in the way she slowly bats her eyelashes... Pumpkin Pie Cookie's favorite things on Earthbread are her fluffy and poofy dress that resembles a pumpkin and the old, tattered doll she always carries around. This Cookie will hold your hand and drag you to play with her whenever there's an exciting festival. Surprisingly, no one has ever said no. You can only wonder if it's because of Pumpkin Pie Cookie's doll that looks almost alive or the giant wavering shadow behind her...",
            quote = "We'll always be together, Pompon...",
            cooldown = 18,
            skillStats = "Summons Pompon with 44.4% ATK (+0.55-0.56% ATK per level), 188.0% DEF, and 382.3% HP\n" +
                    "Healing received: -70.0 % for 3.0 sec\n" +
                    "Pompon's Strike Attack DMG: 170.0%\n" +
                    "ATK SPD: +45.0% while Pompon is active"
        ),
        CookieEntity(
            name = "Rye Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.rye_soulstone,
            cookieCard = R.drawable.rye_card,
            cookieFaceIcon = R.drawable.rye_face_icon,
            cookieFullArt = R.drawable.rye_full_art,
            skillIcon = R.drawable.rye_skill,
            type = RANGED,
            position = REAR,
            rarity = EPIC,
            skillDesc = "Shoot first if you don't wanna be shot! The Cookie aims both pistols at the enemy with the lowest max HP and shoots a round, dealing a great amount of damage several times. The Cookie's Attack Speed is increased greatly for the whole Showdown duration. (Skill cannot be applied to summoned foes.)",
            skill = "Final Showdown",
            gameDescription = "On the sunset of a hard day's work, the saloon door bangs open. \"As usual, boss!\" she yells. Yup, it's Rye Cookie again, so better get her order straight. She's a bounty hunter in these here parts, sporting a shiny badge and all that. The Wild Gun, they call'er. Maybe she's here on a job, or maybe she's just moseying through town. Last time, there been rumors of a brazen heist: someone wiped the wheat silo clean as a whistle, not a single grain left. Wonder who coulda down that? Anyway, better to be careful 'round that one. It's safer to be nice and quiet 'round her, lest ya wanna feel the full barrel from her wholegrain-caliber.",
            quote = "I bite hard and never let go.",
            cooldown = 15,
            skillStats = "Damage dealt: 72.0% (+0.9-1% per level)\n" +
                    "+50.0% ATK SPD for 7.0 sec"
        ),
        CookieEntity(
            name = "Tiger Lily Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.tiger_soulstone,
            cookieCard = R.drawable.tiger_card,
            cookieFaceIcon = R.drawable.tiger_face_icon,
            cookieFullArt = R.drawable.tiger_full_art,
            skillIcon = R.drawable.tiger_skill,
            type = RANGED,
            position = REAR,
            rarity = EPIC,
            skillDesc = "Charges forward on the back of the Butter Tiger, causing damage to nearby enemies and stunning them. While the effect is active, the Cookie deals more damage with faster Regular Attacks.",
            skill = "Tiger Rider",
            gameDescription = "It is not known how Tiger Lily Cookie ended up in the jungle all by herself. Under the constant threat of encroaching enemies, her senses grew sharp. In contrast to her rough outward appearance, she is soft and delicate on the inside. Her only family is her trusty Butter Tiger, whom she cherishes more than anything in the world. Her great skill with the spear and excellent jumping abilities make her one tough Cookie to beat.",
            quote = "Roarr! Protect... I will...",
            cooldown = 13,
            skillStats = "Tiger Rider: attacks atop the Butter Tiger for 5.0 seconds\n" +
                    "Damage dealt: 127.0% (+1.7% per level)\n" +
                    "Stun: 3.0 seconds\n" +
                    "+25.0% ATK SPD for 10.0 sec"
        ),
        CookieEntity(
            name = "Pastry Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.pastry_soulstone,
            cookieCard = R.drawable.pastry_card,
            cookieFaceIcon = R.drawable.pastry_face_icon,
            cookieFullArt = R.drawable.pastry_full_art,
            skillIcon = R.drawable.pastry_skill,
            type = RANGED,
            position = REAR,
            rarity = EPIC,
            gameDescription = "In the name of the Dough, the Oven, and the Witches, I shall fulfill my sacred duty!\" Pastry Cookie left her name and her past behind on the day of her Sacred Brining when she was rebaked as a devoted sister of the St. Pastry Order. \"... like a rolling pin flattening the many layers of pastry dough into uniformity, hardships and suffering produce the endurance to conquer the temptations of our crumbly bodies and souls.\" Now, looking from under the golden phyllo veil, these eyes see nothing else but a turbulent world to be rebuilt in the Order's image. Wielding the Fork of Judgment, her consecrated crossbow, Pastry Cookie has set on her next mission to investigate a tainted shrine. And you would be wise not to stand in her way: the cruel cold metal hungers to deliver judgment.",
            skill = "Battle Prayer",
            skillDesc = "Injustice shall be purged! After a regular attack, Pastry Cookie fires an arrow of light at the nearest enemy. Under the effect of the Battle Prayer, the Cookie's regular attack DMG and ATK SPD are increased.",
            quote = "For the Order!",
            cooldown = 13,
            skillStats = "Battle Prayer: 10.0 sec\n" +
                    "+50.0% ATK SPD for 10.0 sec\n" +
                    "Single hit damage: 80.0% (+0.66-0.67% DMG per level)\n" +
                    "Lightbringer Arrow Ricochet Hits: 2\n" +
                    "Lightbringer Arrow Ricochet Damage: 75.0%"
        ),
        CookieEntity(
            name = "Twizzly Gummy Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.twizzly_soulstone,
            cookieCard = R.drawable.twizzly_card,
            cookieFaceIcon = R.drawable.twilzzly_face_icon,
            cookieFullArt = R.drawable.twizzly_full_art,
            skillIcon = R.drawable.twizzly_skill,
            type = RANGED,
            position = REAR,
            rarity = EPIC,
            skillDesc = "Twizzly Gummy Cookie overloads her Electrojelly Gun and fires a powerful electrifying laser beam. While Twizzly Gummy Cookie is using her skill, her CRIT DMG is increased and enemies hit by her laser beam will be Zapped. This is a non-stackable debuff that deals periodic damage and temporarily disrupts HP Shields. While Twizzly Gummy Cookie is charging her laser, she will briefly become resistant to interrupting effects.",
            skill = "Twizzly Beam",
            gameDescription = "Would you look at that? Gummy wires twisted here and there, sparks flying everywhere! Maybe that's why Twizzly Gummy Cookie's temperament is like chaos itself! She insists that if she doesn't wreak havoc even for one day, her hair will start crackling electricity! *BZZZZT* With her ticking time bomb of a Electrojelly Gun, she will bulldoze a planet and pulverize the planet right next to it! No wonder they call her the Cosmic Criminal—look at her cause absolute mayhem everywhere she lands! To her, battles are just another game that gives her electrifying thrills. Looks like she's done messing with her universe and ready to jump to another dimension! Just what could she be plotting next? Her evil cackling and rampaging sparks can't be good news... Well, good luck to those who come in her way... because it's gonna hurt!",
            quote = "Ha... ha ha! HA HA! HA HA HA! Who's next?!",
            cooldown = 16 ,
            skillStats = "Single hit DMG (Cookies): 7.7% (+0.1% DMG per level)\n" +
                    "Single hit DMG (Others): 4.6% (+0.1% DMG per level)\n" +
                    "Skill CRIT DMG: +350.0%\n" +
                    "Zap: 2.8% DMG every 1.0 sec for 7.0 sec. Nullifies HP Shield."
        ),
        CookieEntity(
            name = "Caramel Arrow Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.caramel_soulstone,
            cookieCard = R.drawable.caramel_card,
            cookieFaceIcon = R.drawable.caramel_face_icon,
            cookieFullArt = R.drawable.caramel_full_art,
            skillIcon = R.drawable.caramel_skill,
            type = RANGED,
            position = FRONT,
            rarity = EPIC,
            skillDesc = "Few enemies can keep their wits when they see the twin blades turning into a bow! Caramel Arrow Cookie performs a ranged attack (targets Cookies first) and leaves an Arrow Mark on the hit enemy. After the ranged attack, the Arrow Mark explodes when Caramel Arrow Cookie rushes towards the enemy, dealing DMG proportional to the enemy's Max HP (this DMG is capped at 300,000). During the ranged attack, Caramel Arrow Cookie receives a buff that makes her immune to debuffs. While Caramel Arrow Cookie is using her skill, she will become resistant to interrupting effects.",
            skill = "Arrow of Resolution",
            gameDescription = "At the very edge of the continent, atop the tall wall of the Black Citadel, stands a figure frowning into the dark. Night and day, all year round, Caramel Arrow Cookie, the First Watcher of the Dark Cacao Kingdom, will always protect the Cookies from the horrors of the Licorice Sea. A master of the Dark Cacao martial art tradition of the perfect balance and a wielder of the black and white twin blades, Caramel Arrow Cookie's loyalty to her king and subordinates remains unwavering even in exile. Some say the kingdom is but a shadow of its former glory, with values like trust becoming a commodity. But a vow is a vow. Standing there atop the tall wall, Caramel Arrow Cookie is staring sharply at the churning dark waters below. The First Watcher will protect the Dark Cacao Kingdom until the very last crumb..",
            quote = "I shall defend the Wall with my life.",
            cooldown = 10,
            skillStats = "Ranged attack: 8.0 sec\n" +
                    "Single hit DMG: 88.3% (+1.2% DMG per level)\n" +
                    "Arrow Mark: 12 second duration, stacks up to max 12 times\n" +
                    "DMG relative to Max HP (Cookies): 22.1% (+0.3% DMG per level)\n" +
                    "DMG relative to Max HP (Others): 2.2% (+0.03% DMG per level)\n" +
                    "Immunity for 8.0 sec\n"
        ),
        CookieEntity(
            name = "Chili Pepper Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.chili_soulstone,
            cookieCard = R.drawable.chili_card,
            cookieFaceIcon = R.drawable.chili_face_icon,
            cookieFullArt = R.drawable.chili_full_art,
            skillIcon = R.drawable.chili_skill,
            type = AMBUSH,
            position = FRONT,
            rarity = EPIC,
            skillDesc = "Sneaks behind the enemy, causing area damage to the rearmost line with 4 strikes. The final strike always deals critical damage.",
            skill = "Cheap Shot",
            gameDescription = "Chili Pepper Cookie's dough contained much more chili pepper than allowed by the law. This is probably why she doesn't care much about rules at all! Chili Pepper Cookie is a notorious treasure hunter. She never misses a chance to snatch everything valuable she can get her hands on, leaving only chaos and havoc behind. The Cookies know better than to cross her path, and so should you. Good news: you can easily identify this path by a trail of fiery red chili sauce...",
            quote = "Lost your Coins?",
            cooldown = 12,
            skillStats = "Damage dealt: 44.5% (+0.6% DMG per level)"
        ),
        CookieEntity(
            name = "Vampire Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.vamp_soulstone,
            cookieCard = R.drawable.vamp_card,
            cookieFaceIcon = R.drawable.vamp_face_icon,
            cookieFullArt = R.drawable.vamp_full_art,
            skillIcon = R.drawable.vamp_skill,
            type = AMBUSH,
            position = REAR,
            rarity = EPIC,
            skillDesc = "Turns into a bat and attacks the farthest enemy, drinking their blood and restoring some HP depending on the amount of caused damage. Restores some HP with each Regular Attack.",
            skill = "Vampirism",
            gameDescription = "The Witch, busy baking several Cookies at once, had forgotten to use her favorite high-quality grapes. Instead, she stored them in oak barrels and let age for a long, long time. And with that special grape juice, she made Vampire Cookie. Naturally, it was difficult for Vampire Cookie to wake up at first—after all, his dough contained more than 10% of strong grape juice! Unlike the other Cookies, Vampire Cookie prefers to do nothing but enjoy life. He wasn't even bothered by the heat of the oven and only escaped because his sister Alchemist Cookie dragged him outside. With his pale face and smug posture, he likes to relax with a glass of grape juice and ponder the meaning of life.",
            quote = "Why so serious? Let me pour you some juice.",
            cooldown = 13,
            skillStats = "Vampirism: 15.0% of DMG\n" +
                    "Damage dealt: 542.5% (+8-8.05% DMG per level)"
        ),
        CookieEntity(
            name = "Black Raisin Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.black_soulstone,
            cookieCard = R.drawable.black_card,
            cookieFaceIcon = R.drawable.black_face_icon,
            cookieFullArt = R.drawable.black_full_art,
            skillIcon = R.drawable.black_skill,
            type = AMBUSH,
            position = MIDDLE,
            rarity = EPIC,
            skillDesc = "No one can hide from the keen Black Raisin Eye! The Cookie vanishes into the shadows, appears amidst the enemy ranks (targets Cookies first), and strikes several times, dealing substantial area damage.",
            skill = "Shadow Watcher",
            gameDescription = "Harsh wind, crooked trees, streets ravaged by the war... Who is it there, hiding among the shadows? Black Raisin Cookie, the sole protector of the unfortunate remnants of a once-great Kingdom. Made of shriveled, wrinkly raisins, this Cookie has learned the value of survival no matter what. Even having lost one arm to the dangers of this rough barren, this Cookie keeps hunting for scarce food to feed those who put their trust in her. Despite all the hardships, Black Raisin Cookie doesn't lose the warmth of a Cookie heart: everyone deserves help, even a sorry one-legged crow. A new day is breaking, and another challenge is here. But Black Raisin Cookie will be there for the villagers, watching over them from the dark",
            quote = "INTRUDER, stop right there!",
            cooldown = 14,
            skillStats = "Damage dealt: 79.7% (+0.96-0.97% DMG per level)"
        ),
        CookieEntity(
            name = "Sorbet Shark Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.sorbet_soulstone,
            cookieCard = R.drawable.sorbet_card,
            cookieFaceIcon = R.drawable.sorbet_face_icon,
            cookieFullArt = R.drawable.sorbet_full_art,
            skillIcon = R.drawable.sorbet_skill,
            type = AMBUSH,
            position = MIDDLE,
            rarity = EPIC,
            skillDesc = "The Cookie ambushes the frontmost enemies in shark form, dealing area damage. Deals additional damage to the two enemies with the highest Max HP within the skill's area of effect (targets Cookies first). For enemies that are Cookies, the additional attack will be dealt as true damage relative to the enemies' Max HP and cannot exceed 300,000. For other enemies, the additional damage will be regular damage.",
            skill = "Shark Splash",
            gameDescription = "Once upon a time, there was a shark that lived in the deep blue sea. This curious swimmer often popped up to the surface to watch the pirates party on their ships. The shark yearned to join the Cookies for these parties, but they always ran away. Saddened, the shark disappeared into the sea for ages. Until suddenly... Sorbet Shark Cookie burst forth from the depths! This Cookie is, frankly, not the fastest runner, can only make bubbly noises instead of words, and gets soggy in the water just like everyone else. But even so, Sorbet Shark Cookie is always wearing a bright smile! After all, the world above the sea is vast and there's so many things to see!",
            quote = "0Ooo0oo0o!",
            cooldown =17  ,
            skillStats = "Single hit DMG: 128.1%\n" +
                    "DMG relative to Max HP (Cookies): 18.0 % (+0.2% per level)\n" +
                    "Single Hit DMG (Others): 378.0% (+5.15% DMG per level)"
        ),
        CookieEntity(
            name = "Cherry Blossom Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.cherry_soulstone,
            cookieCard = R.drawable.cherry_card,
            cookieFaceIcon = R.drawable.cherry_face_icon,
            cookieFullArt = R.drawable.cherry_full_art,
            skillIcon = R.drawable.cherry_skill,
            type = AMBUSH,
            position = REAR,
            rarity = EPIC,
            skill= "Cherry Blossom Rain",
            skillDesc = "Get ready for a storm of cherry blossoms! Cherry Blossom Cookie flies up to shower her enemies with a rain of cherry blossoms, dealing area damage. She will deal additional damage to non-Cookie opponents and increase the ATK of all allies: the bonus value will depend on the number of enemies hit with the skill.",
            gameDescription = "On a warm spring day, the first pink cherry blossoms were collected, then infused for a generous amount of time. Then this essence was used to create Cherry Blossom Cookie. Just by looking at her, you will feel splendid and warm inside, with a tingle on both your cheeks. On a perfect day, you can see her humming, trying to fly into the air with her umbrella open. She is most adorable when she offers you delicious sandwiches and tea. But watch out, once she starts to chat, you will lose track of time!",
            quote = "Shall we go on a picnic?",
            cooldown = 17,
            skillStats = "Single hit DMG: 48.3% (+0.66% DMG per level)\n" +
                    "Additional DMG to non-Cookie targets: 10.0%\n" +
                    "With each 3 hits, the DMG decreases by 20.0% (cannot get decreased by more than 80.0%)\n" +
                    "+2.5% ATK for 12 sec, stacks up to x10 times"
        ),
        CookieEntity(
            name = "Poison Mushroom Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.poison_soulstone,
            cookieCard = R.drawable.poison_card,
            cookieFaceIcon = R.drawable.poison_face_icon,
            cookieFullArt = R.drawable.poison_full_art,
            skillIcon = R.drawable.poison_skill,
            type = BOMBER,
            position = MIDDLE,
            rarity = EPIC,
            skillDesc = "Plants mushrooms that release purple poison clouds around themselves. Poisoned enemies become disoriented and suffer from a debuff reducing Healing, but Poison Mushroom Cookie claims that was never the intention... Poison clouds deal extra Poison DMG to monsters and bosses.",
            skill = "Poison Cloud",
            gameDescription = "Some mushrooms are good for you, and some are not. Take the Purple Cap Mushroom, for example. Looks so chunky and yummy! That is why that hungry Cookie ate it. Why yes, that was Poison Mushroom Cookie. Always peaceful, always daydreaming. Poison Mushroom Cookie would be mistaken for an actual mushroom in the past, but they were never angry, never at all! Poison Mushroom Cookie greeted and hugged these mistaken Cookies like dear old friends, that's right! They offered every one of them a mushroom of their own- so sweet, so colorful. Just one bite, just one... After all, such big friendly eyes mean no harm. No harm at all...",
            quote = "Oooh... New friend... Want a shroomy?",
            cooldown = 15,
            skillStats = "Single hit DMG: 127.8%\n" +
                    "Poison DMG: 25.0% DMG (+0.31% DMG per level) every 1.0 sec over 10.0 sec\n" +
                    "Extra DMG to regular enemies: +80.0%\n" +
                    "Extra DMG to bosses: +120.0%\n" +
                    "Healing received: -15.0% for 10.0 sec"
        ),
        CookieEntity(
            name = "Affogato Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.affogato_soulstone,
            cookieCard = R.drawable.affogato_card,
            cookieFaceIcon = R.drawable.affogato_face_icon,
            cookieFullArt = R.drawable.affogato_full_art,
            skillIcon = R.drawable.affogato_skill,
            type = BOMBER,
            position = MIDDLE,
            rarity = EPIC,
            skillDesc = "Secretly curses the enemy with the highest ATK (targets Cookies first). The cursed target cannot receive any buff effects for a certain time (limited to buffs that can be dispelled). The cursed target will also receive amplified debuffs and will spread Poison inflicting periodic damage to nearby enemies and themselves. If Poison becomes dispelled, it will cause great damage to nearby enemies.",
            skill = "Sweet Scheme",
            gameDescription = "One piping hot cup of dark roasted coffee and a frozen scoop of the sweetest vanilla ice cream! Born of two desserts—so different yet so delicious—Affogato Cookie's flavor is unparalleled! Neither coffee nor ice cream, Affogato Cookie spent restless years without a place to belong until he came up with a simple solution: to create a land of his own once and for all! He appeared out of nowhere on a frigid night in the Dark Cacao Kingdom and has been busy earning the trust and favor of the locals with the help of his strange concoctions and mysterious chants. These are troubling times for the Dark Cacao Kingdom and the throne is empty... What sinister intention is Affogato Cookie hiding behind his snide smile?",
            quote = "The best medicine... tastes sweet in your mouth.",
            cooldown = 15,
            skillStats = "Curse: Target can't receive buffs for 10.0 sec\n" +
                    "Amplified Debuff: 30.0% for 10.0 sec\n" +
                    "Poison: DMG every 0.6 sec for 10.0 sec, a total of 500.4% DMG (+6.81% per level)\n" +
                    "Area Poison: DMG every 1.0 sec for 10.0 sec, a total of 150.1% DMG (+2.04% per level)\n" +
                    "Poison dispelled: 300.2% DMG (+4.09% per level) to nearby enemies"
        ),
        CookieEntity(
            name = "Mint Choco Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.mint_soulstone,
            cookieCard = R.drawable.mint_card,
            cookieFaceIcon = R.drawable.mint_face_icon,
            cookieFullArt = R.drawable.mint_full_art,
            skillIcon = R.drawable.mint_skill,
            type = SUPPORT,
            position = REAR,
            rarity = EPIC,
            skillDesc = "Restores some HP and increases Attack Speed of the squad with a sublime melody.",
            skill = "Battlefield Symphony",
            gameDescription = "His exquisite performance and dashing looks make him a favorite among the Cookies. His Mint Candy Violin gives off a sweet enchanting candy aroma while he plays. Though often called a genius, he refuses to let all this attention go to his head and never forgets his long years as a humble street performer.",
            quote = "What piece shall I play for you?",
            cooldown = 16,
            skillStats = "Healing: 95.0% of ATK (+1.3% per level)\n" +
                    "+40.0% ATK SPD for 7.0 sec"
        ),
        CookieEntity(
            name = "Pomegranate Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.pom_soulstone,
            cookieCard = R.drawable.pom_card,
            cookieFaceIcon = R.drawable.pom_face_icon,
            cookieFullArt = R.drawable.pom_full_art,
            skillIcon = R.drawable.pom_skill,
            type = SUPPORT,
            position = MIDDLE,
            rarity = EPIC,
            skillDesc = "Even dark spells can become a formidable ally! The Cookie's crimson magic applies a buff restoring some HP over time for the whole squad and increases Attack Power.",
            skill = "Pomegranate Magic",
            gameDescription = "Dressed in her scarlet ceremonial attire with glittering pomegranate drop decorations, Pomegranate Cookie was raised in the lands of powerful sorcerers as a young priestess to the Sacred Pomegranate Tree. But when she was foretold to follow a great darkness, she started to doubt her upbringing. When an unstoppable dark force overran her homeland, Pomegranate Cookie already knew she had met her destiny, and gladly joined her mysterious new Master..",
            quote = "For my Master!",
            cooldown = 15,
            skillStats = "Healing: 16.0% of ATK every 1.0 sec over 5.0 sec (+0.22% Healing per level)\n" +
                    "+30.0% ATK for 7.0 sec"
        ),
        CookieEntity(
            name = "Almond Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.almond_soulstone,
            cookieCard = R.drawable.almond_card,
            cookieFaceIcon = R.drawable.almond_face_icon,
            cookieFullArt = R.drawable.almond_full_art,
            skillIcon = R.drawable.almond_skill,
            type = SUPPORT,
            position = REAR,
            rarity = EPIC,
            skill = "Almond Handcuffs",
            skillDesc = "Uses magical handcuffs to apprehend the enemy with the lowest max HP and apply the Damage Link Debuff, which disperses a portion of damage the apprehended enemy receives between up to five linked enemies. Cannot be interrupted. (Handcuffs cannot be applied to summoned foes.)",
            gameDescription = "Pristine coat. Perfect shirt. Combed hair. He always starts his day fresh, prim, and proper. But it never lasts long... After being dispatched to spells gone awry from alley to alley, it looks as if Almond Cookie has been on the job for days on end without a single break. If it isn't an enchanted grimoire moving on its own, it's some magical cauldron spewing Jellies without pause. Despite the chaos on every scene, the veteran detective solves each case by the book with pinpoint precision. The almonds in his dough give him a hardy, rough and tough crisp that can withstand just about anything thrown at him, but he's overworked to the point that his dough no longer contains the rich scent of almonds. \"Can't even get a coffee break,\" he sighs as another magical mishap needs his attention. With his coat fluttering in the wind, Almond Cookie looks upon his city and vows to keep going at it until he can finally relax with a decent coffee.",
            quote = "Let's start from the beginning.",
            cooldown =15 ,
            skillStats = "Damage Link: 70% (+0.6% DMG per level)\n" +
                    "Duration: 3.0 sec"
        ),
        CookieEntity(
            name = "Cream Puff Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.cream_soulstone,
            cookieCard = R.drawable.cream_card,
            cookieFaceIcon = R.drawable.cream_face_icon,
            cookieFullArt = R.drawable.cream_full_art,
            skillIcon = R.drawable.cream_skill,
            type = SUPPORT,
            position = REAR,
            rarity = EPIC,
            skillDesc = "Conjures a tornado of Jellies over a large area, causing area damage and restoring the party's HP. The spell cannot cause CRIT DMG, but instead, there is a chance to conjure it with great success depending on the CRIT%. Cast with great success, the spell will inflict greater DMG and heal a greater amount of HP. While Cream Puff Cookie is using her skill, she will briefly become resistant to interrupting effects.",
            skill = "Jellius Extremus!",
            gameDescription = "Sweet Cream Puff Cookie makes you feel delighted just by looking at her. Made of soft and delicate cream puff, this cookie is as fragile as can be. Something always makes you worry about her, but it's certain that great power sleeps within her. Cream Puff Cookie used to study magic on her own, but now she is a graduate of a prestigious Magic Academy! Will Cream Puff Cookie be able to become a famous wizard? Let's find out!",
            quote = "I'm a real wizard now!",
            cooldown = 16,
            skillStats = "Single hit DMG: 469.5% (0.4-0.5% DMG per level),\n" +
                    "Success: 1166.8% (1.1-1.2% DMG per level)\n" +
                    "Healing: 103.5% of ATK (0.1-0.2% Healing per level),\n" +
                    "Success: 238.6% of ATK (0.2-0.3% Healing per level)"
        ),
        CookieEntity(
            name = "Fig Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.fig_soulstone,
            cookieCard = R.drawable.fig_card,
            cookieFaceIcon = R.drawable.fig_face_icon,
            cookieFullArt = R.drawable.fig_full_art,
            skillIcon = R.drawable.fig_skill,
            type = SUPPORT,
            position = MIDDLE,
            rarity = EPIC,
            skillDesc = "The sound of Fig Cookie's Jelly Horn summons a flock of angered Fig Birds that swarm at the enemies, dealing damage. Surprised by this sudden attack, the enemies suffer from reduced ATK.",
            skill = "Jelly Horn",
            gameDescription = "If you ever go for a forest picnic on a bright sunny day when the fragrant wind caresses your cheeks, the curious Fig Cookie may shyly appear from behind the leaves! This Cookie is known to have dwelled in verdant forests of light and honey for a long, long time. Year after year, the forest awakens at the cheerful sound of Fig Cookie's Jelly Horn, and the brightest of flowers become more colorful and lively than ever. When Fig Cookie shares tales as old as the forest itself, animal friends gather around and listen intently. Prancing about to and fro, the Cookie sometimes ventures to the very edge of the forest to play and run with other Cookies.",
            quote = "Let's prance! An jump! An dance!",
            cooldown =15,
            skillStats = "Single hit damage: 221.0% (+2.45% DMG per level)\n" +
                    "-25.0% ATK for 7.0 sec"
        ),
        CookieEntity(
            name = "Lilac Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.lilac_soulstone,
            cookieCard = R.drawable.lilac_card,
            cookieFaceIcon = R.drawable.lilac_face_icon,
            cookieFullArt = R.drawable.lilac_full_art,
            skillIcon = R.drawable.lilac_icon,
            type = SUPPORT,
            position = MIDDLE,
            rarity = EPIC,
            skillDesc = "Lilac Cookie throws his chakrams in several rounds over a period of time. Friendly units are impressed by the graceful movements, and gain increased regular attack DMG proportional to their ATK SPD boost rate.",
            skill = "Jelly Horn",
            gameDescription = "Lilac petals are known as one of the core ingredients of the love potion. Finely sliced fragments of these petals were sprinkled into the dough and baked under the scorching desert sun. Lilac Cookie treads behind the veil of darkness only to appear with a gust of petals, mere moments before his unsuspecting foes take their final breath. Luring his targets with an irresistible fragrance, Lilac Cookie swiftly sends them to their end with his razor-sharp chakrams, leaving neither footprints nor a sound. The only remnants of his presence are but a few purple petals on the ground... and the lingering, yet soothing scent of lilac in the air.",
            quote = "Those who sense my scent... Never leave alive.",
            cooldown =13,
            skillStats = "Ranged attack: 10.0 sec\n" +
                    "Single hit DMG: 105.0% (+1.45% DMG per level)\n" +
                    "CRegular attack DMG increase: Inflict extra damage equal to 0.4% of the Cookie's ATK for each 1.0% of ATK SPD boost rate for 10.0 sec"
        ),
        CookieEntity(
            name = "Parfait Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.parf_soulstone,
            cookieCard = R.drawable.parf_card,
            cookieFaceIcon = R.drawable.parf_face_icon,
            cookieFullArt = R.drawable.parf_full_art,
            skillIcon = R.drawable.parf_skill,
            type = SUPPORT,
            position = REAR,
            rarity = EPIC,
            skillDesc = "Grabs the microphone and belts her heart out. Touched by the earnest and sincere song, all allies will recover some HP and receive a buff that increases DEF and resistance to debuffs.",
            skill = "Paru-Paru-Parfait!",
            gameDescription = "In a time when there's never a day without a new hot celebrity idol, this singer-songwriter Cookie desperately tries to stick out with sweet toppings in vivid colors! Parfait Cookie's distinct style involves layers of chocolate and candy, topped with dripping syrup. Despite still being a rookie, this Cookie already has dozens of self-written songs. Parfait Cookie's melodies may be just as creative and unique as her colorful mixture of toppings, but her lyrics are always as pure and honest as vanilla ice cream. \"It doesn't matter if the audition goes bad, if no one recognizes me, or even if my toppings melt in the summer rain! I keep playing my guitar and sing about the truth in my heart.\"",
            quote = "Pretty toppings, sweet and lovely! I'm Parfait Cookie, and don't you forget it!",
            cooldown = 17,
            skillStats = "Healing: 14.4% of ATK every 1.0 sec over 7.0 sec (+0.2% Healing per level)\n" +
                    "+10.0% DEF for 7.0 sec\n" +
                    "Debuff Resist Up: +40.0% for 7.0 sec"
        ),
        CookieEntity(
            name = "Cotton Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.cotton_soulstone,
            cookieCard = R.drawable.cotton_card,
            cookieFaceIcon = R.drawable.cotton_face_icon,
            cookieFullArt = R.drawable.cotton_full_art,
            skillIcon = R.drawable.cotton_skill,
            type = SUPPORT,
            position = REAR,
            rarity = EPIC,
            skillDesc = "While Cotton Cookie's lantern shines, the warm light will periodically restore the allies' HP and increase the summoned creatures' ATK. Additionally, Cotton Cookie summons sheep that will charge at the enemies, dealing area damage and stunning them. The summoned sheep will fight alongside the Cookies for a certain time.",
            skill = "A Warm Light",
            gameDescription = "The soft and warm cotton fluff in Cotton Cookie's dough granted her a heart so warm not even a raging blizzard could scare her off. The way she handles her flock of cute wooly sheep ever so gently with her tiny lantern in hand can make anyone feel at peace! Having a lantern in Cotton Cookie's land of constant snowfall is very important: not only stray sheep but also Cookies lost among the dreary white hills depend on it. Cotton Cookie can often be seen restlessly looking at the sky on snowy days—as though expecting to find something amidst the drifting snowflakes. Sometimes, she mentions a Cookie dear to her: her serene, calm face lightens up, making the listener wonder... what happened? Will we ever learn that someone out there is keeping a piece of these snowy plains in their heart? And that a warm yellow light of the tiny lantern will always shine for that special someone. Always.",
            quote = "I hope this light will reach all corners of this land...",
            cooldown = 17,
            skillStats = "Healing: 9.9% of ATK every 1.0 sec for 9.0 sec (+0.08% per level)\n" +
                    "ATK Increase: 75% while the lantern is lit\n" +
                    "Sheep Herd: 124.5% of the Cookie's ATK, 157.8% of DEF, 111.4% of HP\n" +
                    "Sheep Stampede: 150.0% DMG, stuns for 1.0 sec"
        ),
        CookieEntity(
            name = "Eclair Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.eclair_soulstone,
            cookieCard = R.drawable.eclair_card,
            cookieFaceIcon = R.drawable.eclair_face_icon,
            cookieFullArt = R.drawable.eclair_full_art,
            skillIcon = R.drawable.eclair_skill,
            type = SUPPORT,
            position = MIDDLE,
            rarity = EPIC,
            skillDesc = "With all the knowledge and research accumulated over the years, analyzes and identifies the opponent's weakness. Casts 'Weakness' debuff to 3 enemies with the highest ATK (targets Cookies first), amplifying the DMG they receive, and deals DMG. If the enemy is defeated while under the Weakness debuff, all allies gain an HP shield",
            skill = "Book of History",
            gameDescription = "When you're looking around the museum, taking a look at the ancient relics that hold mysteries and stories untold, it feels as if the whole world has grown peaceful and silent. That's usually when the curator of this museum will approach you with a gentle and kind greeting. Eclair Cookie, at your service! With an entire dessert covered in premium fondant icing adorning his hat, he'll greet guests of the museum with elegance and grace, all while making sure there's no trace of dust to be found. But it must be said that he tends to go overboard with his explanations whenever a guest shows interest in his favorite topic: dragon-fighter Cookies! Which is precisely why he's mostly seen in his office, writing reports on these brave and heroic dragon-fighter Cookies. He may be sitting in front of his desk, but do not underestimate his scholarly heart—for his passion for history burns bright as any other adventurer exploring this world.",
            quote = "Ah, have you brought me a relic? Come now, let me take a look!",
            cooldown = 16,
            skillStats = "Weakness: receive +25.0% DMG for 40.0 sec, the effect stacks up to x4\n" +
                    "HP Shield: +25.0% of Max HP for 3.0 sec\n" +
                    "Single hit DMG: 480.6% (+6.54% DMG per level)\n" +
                    "Weakness debuff is refreshed by its further stacks: one stack's duration is 10 sec, two stacks will extend it by 8 sec."
        ),
        CookieEntity(
            name = "Herb Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.herb_soulstone,
            cookieCard = R.drawable.herb_card,
            cookieFaceIcon = R.drawable.herb_face_icon,
            cookieFullArt = R.drawable.herb_full_art,
            skillIcon = R.drawable.herb_skill,
            type = HEALING,
            position = REAR,
            rarity = EPIC,
            skillDesc = "Turns the ground into a wonderful little garden, removing all debuffs and restoring some HP for the whole party. Standing near sprouts also restores some HP over time.",
            skill = "Sunny Garden",
            gameDescription = "Warm like the sunshine and fresh like the scent of rain, Herb Cookie will ease your mind when you're feeling down. Made of fresh green herbs, this Cookie may not be to everyone's taste. On rainy days, Herb Cookie loves to listen to the sound of falling raindrops under his trusty leaf umbrella. On warm days, he enjoys the sunshine together with his favorite plants. This Cookie treats all living things and every moment as precious. He believes that the little things that make you laugh or cry are to be cherished, just like a ray of sunshine after the rain.",
            quote = "Hello there! Welcome to my garden.",
            cooldown = 17,
            skillStats = "Healing: 44.2% of ATK (+0.05% Healing per level)\n" +
                    "Healing: 9.0% (+0.24~0.25% for each tick of Healing per level) every 1.0 sec over 5 sec when standing near sprouts\n" +
                    "Purify: all debuff effects"
        ),
        CookieEntity(
            name = "Sparkling Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.sparkling_soulstone,
            cookieCard = R.drawable.sparkling_card,
            cookieFaceIcon = R.drawable.sparkling_face_icon,
            cookieFullArt = R.drawable.sparkling_full_art,
            skillIcon = R.drawable.sparkling_skill,
            type = SUPPORT,
            position = REAR,
            rarity = EPIC,
            skillDesc = "Throws refreshing healing cocktails at two allies with the lowest HP. The cocktail's divine aroma raises the whole squad's morale, increasing their Critical Strike Chance",
            skill = "Sparkling Cocktail",
            gameDescription = "This is the day! You have received an invitation to the famous Sparkling Party. Sparkling Cookie greets you personally with a dazzling smile and offers a glass of Sparkling Juice. All the guests are fascinated with his impeccable manners and looks: his boyish rolled up sleeves and bouncy bubble hair. It is going to be the best holiday party ever!",
            quote = "Have a glass! It's on me.",
            cooldown = 13,
            skillStats = "Healing: 139% of ATK (+1.8~1.9% per level)\n" +
                    "+25.0% CRIT% for 7.0 sec"
        ),
        CookieEntity(
            name = "Pure Vanilla Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.purevanilla_soulstone,
            cookieCard = R.drawable.pure_vanilla_card,
            cookieFaceIcon = R.drawable.pure_vanilla_face_icon,
            cookieFullArt = R.drawable.pure_vanilla_full_art,
            skillIcon = R.drawable.pure_vanilla_skill,
            type = HEALING,
            position = REAR,
            rarity = ANCIENT,
            skill = "Love & Peace",
            skillDesc = "Illuminates the Battlefield with his Vanilla Orchid Staff, replenishing the party's HP and covering them with shields absorbing an amount of damage proportional to their HP.",
            gameDescription = "There are not many Cookies on Earthbread who could inspire hope as Pure Vanilla Cookie did. Born from nature-blessed cream and a fragrant vanilla bean, he was the epitome of Cookie kindness and faithfulness. Pure Vanilla Cookie strived to forgive the wrongdoer and heal the wounds of Cookies and animals alike. Though a powerful wielder of magic, he would use his spells not for his own good, but for the good of everyone. The Cookie took an arduous pilgrimage down the Sugar-Free Road. What Pure Vanilla Cookie learned through the Trials is unknown, but crowned with a bright halo of light he returned to found the Vanilla Kingdom, a land of freedom and learning, and a beacon for those seeking love and peace. Pure Vanilla Cookie stood by his friends until the very end, warding off the Darkness with a heartfelt smile",
            quote = "The truth always prevails!",
            cooldown = 19,
            skillStats = "Healing: 99.4% of ATK (+1.5% of ATK per level)\n" +
                    "Shield: absorbs 20.0% of max HP for 3.0 sec"
        ),
        CookieEntity(
            name = "Hollyberry Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.holly_soulstone,
            cookieCard = R.drawable.holly_card,
            cookieFaceIcon = R.drawable.holly_face_icon,
            cookieFullArt = R.drawable.holly_full_art,
            skillIcon = R.drawable.holly_skill,
            type = CHARGE,
            position = FRONT,
            rarity = ANCIENT,
            skillDesc = "Let out a war cry of fury! Hollyberry Cookie charges forward and becomes a shield to all of her Cookie allies, absorbing a portion of the damage they take, excluding continuous DMG and indirect DMG. While Hollyberry Cookie is using her skill, she will briefly become resistant to interrupting effects.",
            skill = "Oath on the Shield",
            gameDescription = "What else could result in such an overwhelming passion if not the reddest hollyberries, ripened under the hottest summer sunlight? Hollyberry Cookie believes that every friendship, like every victory, should be triumphant. After all, there is nothing in the world as hard as trust! Not even the all-enduring Hollyberry Shield with which she swore to protect her beloved ones. It is said that Hollyberry Cookie leading a charge onto the battlefield is the most inspiring view. A view that inspires to repay with trust to those who put trust in you.",
            quote = "Blow the horn! Hollyberry Cookie has arrived!",
            cooldown = 18,
            skillStats = "Single hit DMG: 185.5% (+2.53% DMG per level)\n" +
                    "DMG Focus: 20.0% of DMG of allies for 9.0 sec"
        ),
        CookieEntity(
            name = "Dark Cacao Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.cacao_soulstone,
            cookieCard = R.drawable.cacao_card,
            cookieFaceIcon = R.drawable.cacao_face_icon,
            cookieFullArt = R.drawable.cacao_full_art,
            skillIcon = R.drawable.cacao_skill,
            type = HEALING,
            position = REAR,
            rarity = ANCIENT,
            skillDesc = "Swings the Grapejam Chocoblade with great force, causing thunder and lighting to inflict damage upon foes in range. This mighty attack reduces enemies' ATK, DEF and inflicts Zap and Injury. Injured foes will have reduced Max HP, and the injury debuff ignores immunity and dispelling effects not mentioning Injury specifically. While Dark Cacao Cookie is using his skill, he will briefly become resistant to interrupting effects.",
            skill = "Solemn Judgment",
            gameDescription = "The last bean, devoid of any sweetness, fell down from a withered branch of a lonely cacao tree growing above the edge of a cliff. Lying there in frozen soil, enduring snow and wind, this bean wasn't aware of its destiny to become the main ingredient for the cold and reclusive Dark Cacao Cookie. A warrior of unheard strength, Dark Cacao Cookie wielded the Grapejam Chocoblade. This sword was so heavy it required three average Cookies to even budge it. With each swing, the skies erupted into thunder and lightning, avalanches tumbled down countless mountains. Dark Cacao Cookie was known as a Cookie of few words but great principle. After the Dark Flour War's sorrowful events, the warrior locked himself away in the solitude of his own castle.... Will anything be able to melt his frozen soul once again?",
            quote = "Great strength leads to bitter consequences…",
            cooldown = 16,
            skillStats = "First hit DMG: 46.9% (+0.64% DMG per level)\n" +
                    "Second hit DMG: 265.8% (+3.62% DMG per level)\n" +
                    "Passive: Debuff Resist +20.0%\n" +
                    "-15.0% DEF for 9.0 sec\n" +
                    "-10.8% ATK for 9.0 sec\n" +
                    "Injury: 12.5% Max HP Reduction for 30.0 sec (from the start of the battle), Injury limit up to 25%\n" +
                    "Zap: 3.0% DMG every 1.0 sec for 9.0 sec. Nullifies HP shield."
        ),
        CookieEntity(
            name = "Sea Fairy Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.sea_soulstone,
            cookieCard = R.drawable.sea_card,
            cookieFaceIcon = R.drawable.sea_face_icon,
            cookieFullArt = R.drawable.sea_full_art,
            skillIcon = R.drawable.sea_skill,
            type = BOMBER,
            position = MIDDLE,
            rarity = LEGENDARY,
            skillDesc = "Fires a stream of water, inflicting damage and stunning 5 closest enemies (targets Cookies first). After a certain time, a full moon-shaped pool of water created underneath the targets bursts up with the power of eternity, dealing heavy damage. (Skill cannot be applied to summoned foes.)",
            skill = "Soaring Compassion",
            gameDescription = "Sea Fairy Cookie was frozen under a curse long ago. But perhaps because of her grieving heart, her soul was frozen beyond magic. If it weren't for the warm kindness of our Cookies, she might have chosen to stay frozen forever. Beyond her flowing hair, the twinkle in her eyes still states that she is willing to fight her fate. Let's hope she does not let go of her sword, giving up hope and choosing to turn into sea foam.",
            quote = "I feel the warmth of your heart...",
            cooldown = 17,
            skillStats = "Water Stream DMG: 150.0%\n" +
                    "Water Pillar DMG: 173.0% (+4.4% DMG per level)\n" +
                    "Stun: 3.0 sec"
        ),
        CookieEntity(
            name = "Frost Queen Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.frost_soulstone,
            cookieCard = R.drawable.frost_card,
            cookieFaceIcon = R.drawable.frost_face_icon,
            cookieFullArt = R.drawable.frost_full_art,
            skillIcon = R.drawable.frost_skill,
            type = MAGIC,
            position = MIDDLE,
            rarity = LEGENDARY,
            skillDesc = "Casts a squall of freezing energy dealing damage and freezing all enemies. Once Frozen, the targets' Cooldown will be paused and will receive an additional portion of damage when thawed. If the Freeze debuff is dispelled, the targets will not receive the additional damage. Frost Queen Cookie herself is immune to freezing. While Frost Queen Cookie is using her skill, she will briefly become resistant to interrupting effects.",
            skill = "Freezing Squall",
            gameDescription = "Somewhere amidst endless snow stands the lone castle of ice. In its halls of perpetual twilight dwells Frost Queen Cookie, the sovereign of winter itself. Like a fairytale queen, she dazzles with regal magnificence, yet her icy gaze leaves your soul cold and dreary, like tundra after a relentless blizzard. Her Cookie heart with all its mortal hopes and passions is long but frozen, all but one: her adamant will to accomplish her mission. A mission of utmost importance to the existence of the world. Ages might pass, but the castle of ice will remain: and so will Frost Queen Cookie, the guide for the myriads of Life-bearing snowflakes",
            quote = "You cannot defy the cycle of life.",
            cooldown = 18,
            skillStats = "Single hit DMG: 67.8% (+0.92% DMG per level)\n" +
                    "Freeze Time: 2.0 sec\n" +
                    "Freeze DMG: 271.2% of ATK (+3.69% DMG per level)"
        ),
        CookieEntity(
            name = "Muscle Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.muscle_soulstone,
            cookieCard = R.drawable.muscle_card,
            cookieFaceIcon = R.drawable.muscle_face_icon,
            cookieFullArt = R.drawable.muscle_cookie_full_art,
            skillIcon = R.drawable.muscle_skill,
            type = CHARGE,
            position = FRONT,
            rarity = COMMON,
            skillDesc = "Throws a dumbbell with fearsome strength at the nearby enemies, causing Shock within the radius when throwing and when the dumbbell falls.",
            skill = "Freezing Squall",
            gameDescription = "Muscle Cookie's recipe requires large quantities of protein powder and about three weeks of intensive kneading. Only after that, the taste of raw muscle power comes to life. Such a rigorous cooking process has made Muscle Cookie a bit short-tempered. He tends to throw exercise equipment when angry. But don't be afraid: once he's done dealing with Cake Monsters, he's as cool as a cucumber.",
            quote = "Gosh, do you even lift?",
            cooldown = 18,
            skillStats = "10 second base Cooldown\n" +
                    "Damage dealt: 81.0% base damage (+1.1% DMG per level)"
        ),
        CookieEntity(
            name = "Cherry Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.cherry_rare_soulstone,
            cookieCard = R.drawable.cherry_rare_card,
            cookieFaceIcon = R.drawable.cherry_rare_face_icon,
            cookieFullArt = R.drawable.cherry_rare_full_art,
            skillIcon = R.drawable.cherry_rare_skill,
            type = BOMBER,
            position = REAR,
            rarity = RARE,
            skillDesc = "A giant cherry bomb causes area damage and stuns enemies.",
            skill = "Huge Cherry Bomb",
            gameDescription = "Behind her endearing smile and adorable looks, Cherry Cookie hides a destructive nature. A real troublemaker decorated with bright red cherry syrup, she enjoys pulling destructive pranks. She especially enjoys throwing her Cherry Bombs, which explode like fireworks. Believe it or not, the sweet, invigorating smell of cherry black powder in the air can blow any stress away!",
            quote = "Here goes my Cherry Bomb! Boom! BOOM!",
            cooldown = 16,
            skillStats = "Damage dealt: 146.0% base (+2% DMG per level)\n" +
                    "Stun: 2.0 sec"
        ),
        CookieEntity(
            name = "Clotted Cream Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.clotted_soulstone,
            cookieCard = R.drawable.clotted_card,
            cookieFaceIcon = R.drawable.clotted_face_icon,
            cookieFullArt = R.drawable.clotted_full_art,
            skillIcon = R.drawable.clotted_skill,
            type = MAGIC,
            position = MIDDLE,
            rarity = SUPER_EPIC,
            skillDesc = "The Cloak of Light, a marvel of the Republic's cutting-edge technology, provides unquestionable advantages in battle. Upon using his skill, Clotted Cream Cookie projects the Light Cage onto the nearest enemy (targets Cookies first), blocking buffs and dealing area damage. The Light Cage cannot be dispelled and can be projected onto Cookies resistant to interrupting effects and prevents them from receiving removable buffs. The Light Cage will also inflict extra damage relative to the target's HP at the end of its duration. While Clotted Cream Cookie is using his skill, he will become resistant to interrupting effects. (DMG relative to Max HP is capped at 300,000)",
            skill = "Consul's Orders",
            gameDescription = "Impeccable posture, perfect necktie knot, and a charming smile! Add a generous amount of filling: a mixture of cream, ambition, and respectability, and you will get the Republic's youngest Consul ever. Clotted Cream Cookie's first achievement in office was the consolidation of the Republic's fractured society. Even the Elders, whose authority in the city-state is unquestionable, recognize the Consul's brilliance and eloquence. Indeed, Clotted Cream Cookie's approval rating and influence are growing by the day! But beware: each of his sweet smiles is thoroughly calculated. This Cookie is always on the winning side.",
            quote = "My name is Clotted Cream Cookie, elected Consul of the Crème Republic.",
            cooldown = 15,
            skillStats = "Total Periodic DMG: 308.5% (+4.2% per level), 22 ticks for 1.4 sec\n" +
                    "Debuff Light Cage DMG: 189.0%\n" +
                    "Light Cage duration: 4.8 sec\n" +
                    "Cage extra DMG:\n" +
                    "Cookies: 89.9% DMG relative to Max HP + 20.0% fixed DMG relative to Max HP, Stun for 1.3 sec\n" +
                    "Others: 1.3% DMG relative to Max HP + 146.9% DMG (+1.8~1.9% per level), Stun for 1.3 sec\n" +
                    "+17.5% DMG Resist over 8.0 sec"
        ),
        CookieEntity(
            name = "Oyster Cookie",
            soulStoneCount = 0,
            soulStoneImage = R.drawable.oyster_soulstone,
            cookieCard = R.drawable.oyster_card,
            cookieFaceIcon = R.drawable.oyster_face_icon,
            cookieFullArt = R.drawable.oyster_full_art,
            skillIcon = R.drawable.oyster_skill,
            type = SUPPORT,
            position = REAR,
            rarity = SUPER_EPIC,
            skillDesc = "Summons soldiers of House Oyster and increases the CRIT% and CRIT DMG for herself and nearby allies for a certain amount of time. The summoned soldiers will immediately charge at the enemies, dealing damage. The soldiers will have extra DEF until the HP of their shields hits zero. Their shields will also resist Knockbacks and Flying. When Oyster Cookie receives a cooldown reduction buff, instead of cooldown reduction, the number of Oyster Soldiers and their ATK will increase.",
            skill = "Might of House Oyster",
            gameDescription = "Massive merchant vessels with mermaid statues adorning the stemhead fill the docks of the Creme Republic, all waiting for Oyster Cookie's command. All it takes is one single wave to signal the giant ships to cross the ocean and create new tides. With her noble allure and eloquent words that can steer the conversation the way she wishes, one can't help but be in awe of Oyster Cookie's presence. Some Cookies wonder how a Cookie of the Sea could achieve such fame and prestige among the Republic's crème de la crème. One theory is that House Oyster is somehow connected to the underwater mermaids from the old legends, but no one knows the truth. Oyster Cookie is known to exert her power and influence to create a favorable tide whenever precious goods and valuable information are involved. Perhaps that's why the ambitious come knocking at Manor Oyster's doors. Because some offers are worth risking it all!",
            quote = "I believe that no further introduction is required.",
            cooldown = 17,
            skillStats = "Soldiers' Charge DMG: 94.0%\n" +
                    "Oyster Soldiers: caster's 42.9% ATK, 179.0% DEF, 118.0% HP\n" +
                    "Additional Soldiers: get an extra Oyster Soldier for every -18.1% to Cooldown (up to 4 Oyster Soldiers in total)\n" +
                    "Soldiers' ATK: get +0.9% ATK for every -1.0% to Cooldown (up to +50.0% ATK)\n" +
                    "Soldiers' Shield: 60.0% of Oyster Soldiers' HP, DEF +30.0%, resistance to Knockback and Flying\n" +
                    "CRIT Boost: 16.5% for 17.0 sec\n" +
                    "CRIT DMG Boost: 13.0% for 17.0 sec"
        ),
    )
}