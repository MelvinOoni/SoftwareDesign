package Game;

public class WelcomeAndClosing {

    public void showWelcome()
    {
        String msg =  " ***  WELCOME at the  ***\n"
                + "   *  three PENGUINS  *\n"
                + "   *  and a POLARBEAR *\n"
                + "   *      ZOO         *\n"
                + ""
                + " This week, YOU will be the ZOO caretaker";

        System.out.println(msg);
    }

    public void showInstructions()
    {
        String msg = "You must feed the animals to keep up the zoo.\n"
                + "Use 'new day' to advance to the next day\n"
                + "Use 'feed penguin' to throw a fish to the penguins\n"
                + "Take care that all penguins are fed each day\n"
                + "Oh, and dont forget the polar bear.";

        System.out.println(msg);
    }

    public void showFullScreen()
    {
        String msg = "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
                + ":::::::::::::::::::::::::::::::::::::::://::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
                + ":::::::::::::::::::::::::::::::::::::::yNmmo:::::::::::::/::::::::::::::::::::::::::::::::::::::::::\n"
                + "::::::::::::::::::::::::::::::::::::::yMMNMyoso::::::::+mmdo::::::::::::::::::::::::::::::::::::::::\n"
                + ":::::::::::odmh/::::::::::::::::::::/dMMMMdy++/:::::::sNMNNs+oo/::::::::::::::::::::::::::::::::::::\n"
                + "::::::::++/yNMMmo///:::::::::::::::oNMMMMd.o::::::::omMMMMhs+oo/::::::::::::::::::::::::::::::::::::\n"
                + ":::::::/osddmdNMMNNNmhs::::::::::::NMMMMMy -+::::::yMMMMMo-o::::::::::::::::::::::::::::::::::::::::\n"
                + "+/////:::/+/+:-yNMMNs:::::::::::::oMMMMMMMy:/y+:::+NMMMMM/`+/:::::::::::::::::::::::::::::::::::::::\n"
                + "/oyhy+:::::+s`  :mMMNy:::::::::::-sMMMMMm+/:-yo:::hMMMMMNm:-o-::::::::::::::::::::::::::::::::::::::\n"
                + "+//::-----om.    :NMMMo-----------yMMMMMN:  /+---:mMMMMM/---+---------------------------------------\n"
                + "----------+s.    `hMMMy----------:dMMMMMN- :o:---+MMMMMM: `o:---------------------------------------\n"
                + "-----------/+     oMMMy-::/+++osydNMNNMNo:sy+///sNMMMMNs.:+/----------------------------------------\n"
                + "------------/+-`./dMMMmhys+//::-//:---:o++osossdNmdhdmmysho+:---------------------------------------\n"
                + "-------------:yhhNNho+o/``               ``    ....``..--:/osso+:-----------------------------------\n"
                + "-----------:shyys+-`                                        `.:/oso+/:------------------------------\n"
                + "---------:sh+.```                                                `-+ossssooo++++sy+::---------------\n"
                + "--------/ho.`                                                          ```../ooo/-::++/+/:----------\n"
                + "-----:+/:-`                WELL DONE!                                      `ho::.   .+`.:oso+:------\n"
                + "----/s:`                                                                    ./++.    `    `.:/++----\n"
                + "----s./`             ``                                                      `             `  +mdo--\n"
                + "--.od/+             `````                                                   ``                -ysd:-\n"
                + "...omh:             `````                                                    `             -:::/+h:.\n"
                + "....:ss `            ``./`               -                                          `.-::::oossys:..\n"
                + "...../m-``            ``./.              /-`                        ```` ````...////+oo+///:::-.....\n"
                + ".....-sm/.`        .`    ./`             ./:                     //++sysss+::+sss//-................\n"
                + ".......mms-``      ``    `:-`             `s/`              `o-`/Ny+://:-...........................\n"
                + "......+mo+y+.``       ``-+s+-             `/o.             -ss./m+..................................\n"
                + "....-+s:..-sy+.``    ```./hd-```         `-hmh`            -h/-+:...................................\n"
                + "..:+o-....-+hMmy-`    ```.:ds/:-......:++sys+m-`            -do.....................................\n"
                + ":ho-.....-sMmdsoho.    ```.yMNNmdhhoo+/:.....ss:.`           .yo....................................\n"
                + "/d-......omy:...-ys.    ```yh:::--...........-/sys/.`         `+y+-.................................\n"
                + " sh-.....-:+:` ``oy.`    `.hs.......```````      .sdo-`         .sd:           `````````````...`````\n"
                + " `ho---..-ysh`   /h.`    `.+o/```                 /d+yo:``        -yy+++:`                          \n"
                + "  .oyyyhyyNNo    /m-.``      .//+s/`             /d+..:oso/.```     -+:-/sy/                        \n"
                + ".......-:::.``...+N+::..````  `:o:m+`......`````sy-......:yds/-.```    `/s:y-``````````````````     \n"
                + "``````````````````/o++//+/////+ss+/.````````````:yysysssyysyyhosyo+++///+ms+-......```````````````  ";

        System.out.println(msg);
    }

    public void closeApp()
    {
        showGoodBye();
        System.exit(0);
    }

    public void showGoodBye()
    {
        System.out.println("bye ...");
    }
}
