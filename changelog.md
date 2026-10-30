# v-1.13.0:

- Gradle has been updated to version 7.5.1
- The bug with achievement conditions has been fixed
- Worldgen has been slightly optimized
- The ability to adjust the frequency of flower and cactus generation has been added
- Russian localization has been added (`ru_ru.lang`)
- PNG texture files have been optimized by reencoding them into a more efficient format
- The ability to disable the registration of flower pots in the game has been added
- Recipe registration is now performed via a `java` file instead of a `json` file
- A configuration parameter has been added to control the registration of Colored Clay (ItemColoredClay && UnfiredPots)
- Some more simplifications have been made to certain parts of the code.
.
- The implementation of registering villagers’ trades has been changed: now everything is in a single file to save on mod size, and overall it’s easier to understand (remove this commit if you don’t want this change).
.
