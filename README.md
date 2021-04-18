# Jetbrains Academy - Parking Lot

My solutions for the Jetbrains Academy Problem Parking Lot

https://hyperskill.org/projects/75

The solution is build up step by step over several stages. 
Stage 1 is the first and simple one. The following stages 
build up on the previous stages and get more and more advanced.
There are five stages in total.

Because each stage is completely independent of the previous one,
IntelliJ might show some warnings about duplicated code between 
the stages.

## Stage 1/5

[click here to see description @ JetBrains Academy](https://hyperskill.org/projects/75/stages/416/implement)

Just some simple output.

just execute this:

    gradle -PmainClass=stage1.MainKt run --console=plain

    White car has parked.
    Yellow car left the parking lot.
    Green car just parked here.

## Stage 2/5

[click here to see description @ JetBrains Academy](https://hyperskill.org/projects/75/stages/417/implement)

Now we have 2 slots in the parking lot and can _park_ or _leave_ cars.
Program will exit after one action.

just execute this:

    gradle -PmainClass=stage2.MainKt run --console=plain

    park KA-01-HH-1234 Blue
    Blue car parked in spot 2.
    

## Stage 3/5

[click here to see description @ JetBrains Academy](https://hyperskill.org/projects/75/stages/418/implement)

Now we have 20 slots and program will run in a loop until user enters _exit_.

just execute this:

    gradle -PmainClass=stage3.MainKt run --console=plain

    park ASD-213 blue
    blue car parked in spot 1.

    leave 2
    There is no car in spot 2.

    exit
    
## Stage 4/5

[click here to see description @ JetBrains Academy](https://hyperskill.org/projects/75/stages/419/implement)

Here we add the feature to create a new parking lot.

just execute this:

    gradle -PmainClass=stage4.MainKt run --console=plain
    
    status
    Sorry, a parking lot has not been created.
    
    create 20
    Created a parking lot with 20 spots.
    
    status
    Parking lot is empty.
    
    park asd-2121 bue
    bue car parked in spot 1.
    
    status
    1 asd-2121 bue
    
    leave 2
    There is no car in spot 2.
    
    exit

## Stage 5/5

[click here to see description @ JetBrains Academy](https://hyperskill.org/projects/75/stages/420/implement)

Here we can query for cars:
* spot_by_color: list all spots with cars of given color
* reg_by_color: list all registration numbers with cars of given color
* spot_by_reg: list all spots with cars of given registration number

just execute this:

    gradle -PmainClass=stage5.MainKt run --console=plain
    
    create 10
    Created a parking lot with 10 spots.

    park asd-123 blue
    blue car parked in spot 1.

    spot_by_color blue
    1

    park aaa-1212 blue
    blue car parked in spot 2.

    status
    1 asd-123 blue
    2 aaa-1212 blue

    reg_by_color blue
    asd-123, aaa-1212

    exit