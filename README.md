CleanRoute - UI-only Android Project (Kotlin)
===========================================

What's included:
- Minimal Android Studio project focused on neat UI for authentication flows:
  Splash -> Login -> Signup -> Register (role selection) -> Home (Citizen/Collector/Admin)
- Simple navigation and placeholders for main screens.
- No backend integration; this is UI-only and intended for MAD project demonstration.

How to open:
1. Move the project folder to your development machine (or download the zip).
2. Open Android Studio -> Import project (the folder containing settings.gradle).
3. Update local.properties (sdk.dir) to match your Android SDK path if needed.
4. Sync Gradle and run on an emulator or device (minSdk 21).

Notes:
- The project avoids external heavy dependencies to reduce import/build errors.
- For map, camera, or backend features add the required libraries and permissions as needed.
