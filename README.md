# Running the Movie Recommendation System

## Windows

## MAC OS - NO IDE REQURIED or USED

### Install Java and git

`brew install java`

`brew install git`

`git clone https://github.com/XxDevilsCloverxX/Java_Programs.git`

`cd Java_Programs/`

### Verify install
`java -version`

> java version "19.0.2" 2023-01-17
>
> Java(TM) SE Runtime Environment (build 19.0.2+7-44)
>
> Java HotSpot(TM) 64-Bit Server VM (build 19.0.2+7-44, mixed mode, sharing)

`javac -version`

> javac 19.0.2

### Compile and run
`javac movie_rec_proj/*.java`

`java movie_rec_proj/Test`

## Linux (Debian based) - Ubuntu, Mint, etc. see below for other distros - NO IDE REQURIED or USED

    ### Install Java and git
    Open a Terminal and run
    'sudo apt update'
    'sudo apt install default-jdk'
    'sudo apt install git'
    *create a directory for install and move to the download package*
    'mkdir ~/java'
    'cd ~/java'
    'git clone https://github.com/XxDevilsCloverxX/Java_Programs.git'
    'cd Java_Programs/'

    ### Verify install
    'java --version'
    'javac --version'
    *should return something like*
        openjdk 11.0.18 2023-01-17
        OpenJDK Runtime Environment (build 11.0.18+10-post-Ubuntu-0ubuntu122.04)
        OpenJDK 64-Bit Server VM (build 11.0.18+10-post-Ubuntu-0ubuntu122.04, mixed mode, sharing)
        javac 11.0.18

    ### Compile and run
    'javac movie_rec_proj/*.java'
    'java movie_rec_proj/Test'

## Linux (Red Hat based) - Fedora, CentOS, etc. - NO IDE REQURIED or USED

    ### Install Java and git
    Open a Terminal and run
    'sudo dnf install java-11-openjdk-devel'   # for Fedora
    'sudo dnf install java-11-openjdk-devel'   # for Red Hat
    'sudo yum install java-11-openjdk-devel'   # for CentOS
    'sudo dnf install git'
    *create a directory for install and move to the download package*
    'mkdir ~/java'
    'cd ~/java'
    'git clone https://github.com/XxDevilsCloverxX/Java_Programs.git'
    'cd Java_Programs/'

    ### Return to Linux (Debian based) - Ubuntu, Mint, etc. see below for other distros

## Linux (Arch based) - Manjaro, Antergos, etc. - NO IDE REQURIED or USED

    ### Install Java and git
    Open a Terminal and run
    'sudo pacman -S jdk-openjdk'
    'sudo pacman -S git'
    *create a directory for install and move to the download package*
    'mkdir ~/java'
    'cd ~/java'
    'git clone https://github.com/XxDevilsCloverxX/Java_Programs.git'
    'cd Java_Programs/'

    ### Return to Linux (Debian based) - Ubuntu, Mint, etc. see below for other distros

## VS Code

    ### Install VS Code - Search for VS Code in your package manager or download from the website if Windows or Mac
    'sudo apt install code' # for Debian based distros
    'sudo dnf install code' # for Red Hat based distros
    'sudo pacman -S code'   # for Arch based distros

    ### Install Java Extension Pack
    Open VS Code and click on the extensions icon on the left side of the window
    Search for Java Extension Pack and click install
    *this will install the Java Language Support, Debugger for Java, Java Test Runner, Maven for Java, Java Dependency Viewer, and Visual Studio IntelliCode extensions*

    ### Open the project
    Open VS Code and click on the file icon on the left side of the window
    Click on the open folder icon and navigate to the Java_Programs/movie_rec_proj folder
    Click on the folder and click open

    ### Compile and run
    Open the Test.java file
    Click on the run icon on the left side of the window *or* Click on the run button at the top of the window
