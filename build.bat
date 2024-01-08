for /r ./src %%i in (*.java) do javac -d ./build -sourcepath ./src "%%i"
