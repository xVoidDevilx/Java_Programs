# Running the Movie Recommendation System

## Windows - NO IDE REQUIRED or USED

> Install Java JDK
    Using your preferred web browser, navigate to the [Oracle Java Downloads page]: 
    
    On the Downloads page, click the x64 Installer download link under the Windows category. At the time of writing this article, Java version 17 is the latest long-term support Java version.
    
    Double-click the downloaded file to start the installation. _> Follow the installation wizard with default or advanced settings, if you customize, be aware this guide may require changes.

    [Oracle Java Downloads page]: https://www.oracle.com/java/technologies/downloads/#jdk17-windows

> Add Java to system variables
    1. Open the Start menu and search for environment variables.

    2. Select the Edit the system environment variables result.

    3. In the System Properties window, under the Advanced tab, click Environment Variables

    4. Under the System variables category, select the Path variable and click Edit:

    5. Click the New button and enter the path to the Java bin directory:

    6. Click OK to save the changes and exit the variable editing window.

> Add JAVA_HOME to system variables
    1. In the Environment Variables window, under the System variables category, click the New… button to create a new variable.

    2. Name the variable as JAVA_HOME.

    3. In the variable value field, paste the path to your Java jdk directory and click OK.

    4. Confirm the changes by clicking OK in the Environment Variables and System properties windows.

> Test the installation
    1. Open a command prompt or powershell

    2. Enter 'java --version'
    *should return something like*
        java version "17" 2021-09-14 LTS
        Java(TM) SE Runtime Environment (build 17+35-LTS-2724)
        Java HotSpot(TM) 64-Bit Server VM (build 17+35-LTS-2724, mixed mode, sharing)

> Clone the repository
    1. Open a command prompt or powershell

    2. Enter `git clone https://github.com/XxDevilsCloverxX/Java_Programs.git` without the '`' character

> Change into the directory
    1. Enter `cd Java_Programs` without the '`' character

> Compile and run

    1. Enter `javac movie_rec_proj/*.java` without the '`' character

    2. Enter `java movie_rec_proj/Test` without the '`' character

    
## MAC OS - NO IDE REQURIED or USED

### Install Brew, Java, and git

`/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"`

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

> Install Java and git
    Open a Terminal and run
    'sudo apt update'
    'sudo apt install default-jdk'
    'sudo apt install git'
    *create a directory for install and move to the download package*
    'mkdir ~/java'
    'cd ~/java'
    'git clone https://github.com/XxDevilsCloverxX/Java_Programs.git'
    'cd Java_Programs/'

> Verify install
    'java --version'
    'javac --version'
    *should return something like*
        openjdk 11.0.18 2023-01-17
        OpenJDK Runtime Environment (build 11.0.18+10-post-Ubuntu-0ubuntu122.04)
        OpenJDK 64-Bit Server VM (build 11.0.18+10-post-Ubuntu-0ubuntu122.04, mixed mode, sharing)
        javac 11.0.18

> Compile and run
    'javac movie_rec_proj/*.java'
    'java movie_rec_proj/Test'

## Linux (Red Hat based) - Fedora, CentOS, etc. - NO IDE REQURIED or USED

> Install Java and git
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

 > Return to Linux (Debian based) - Ubuntu, Mint, etc. see below for other distros

## Linux (Arch based) - Manjaro, Antergos, etc. - NO IDE REQURIED or USED

> Install Java and git
    Open a Terminal and run
    'sudo pacman -S jdk-openjdk'
    'sudo pacman -S git'
    *create a directory for install and move to the download package*
    'mkdir ~/java'
    'cd ~/java'
    'git clone https://github.com/XxDevilsCloverxX/Java_Programs.git'
    'cd Java_Programs/'

 > Return to Linux (Debian based) - Ubuntu, Mint, etc. see below for other distros

## VS Code

> Install VS Code - Search for VS Code in your package manager or download from the website if Windows or Mac
    'sudo apt install code' # for Debian based distros
    'sudo dnf install code' # for Red Hat based distros
    'sudo pacman -S code'   # for Arch based distros

    ### Install Java Extension Pack
    Open VS Code and click on the extensions icon on the left side of the window
    Search for Java Extension Pack and click install
    *this will install the Java Language Support, Debugger for Java, Java Test Runner, Maven for Java, Java Dependency Viewer, and Visual Studio IntelliCode extensions*

> Open the project
    Open VS Code and click on the file icon on the left side of the window
    Click on the open folder icon and navigate to the Java_Programs/movie_rec_proj folder
    Click on the folder and click open

> Compile and run
    Open the Test.java file
    Click on the run icon on the left side of the window *or* Click on the run button at the top of the window
