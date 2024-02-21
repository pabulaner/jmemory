package de.crs.jmemory;

public class MemoryCardContent {

    public static final String[] CONTENTS = {
            // 30 x
            """
                int x = 10;
                long y = 20;
                print(x + y);
            """,
            // 6 x
            """
                long x = 0;
                for (int i = 0; i < 4; i++) {
                    x += i;
                }
                print(x);
            """,
            // -1 x
            """
                short x = 10;
                int y = 3;
                x %= y;
                x -= 2;
                print(x);
            """,
            // -1 x
            """
                boolean b = true && (false || true);
                if (b) {
                    print(-1);
                } else {
                    print(4);
                }
            """,
            // 6 x
            """
                String s = "Hello World!";
                switch (s) {
                    case "hello world!": print(4); break;
                    case "Hello  World!": print(30); break;
                    case "Hello World!": print(6); break;
                }
            """,
            // 30 x
            """
                byte x = (10 < 5) ? 4 : 5;
                byte y = (x == 4) ? 9 : 10;
                print(x * y - 20);
            """,
            // -2 x
            """
                int x = 1;
                while (x < 7) {
                    x += x;
                }
                print(x - 10);
            """,
            // -2 x
            """
                float f = 2.5f;
                double d = 6.0;
                print(f * d - 17.0);
            """
    };
}
