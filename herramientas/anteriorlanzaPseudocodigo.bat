@echo off
echo    ========================================================================
echo    =                            lanzaPseudocodigo                         =
echo    =                               version 1.0                            =
echo    =                                 Utilidad                             =
echo    =                                                                      =
echo    = Descripcion: Archivo por lotes para automatizar la invocacion del    =
echo    =              compilador del lenguaje EPLOAM y ejecucion del programa =
echo    =              construido.                                             =
echo    =                                                                      =
echo    = Construida por: Orlando Arboleda Molina, Msc.                        =
echo    =                               25/05/2010                             =
echo    ========================================================================
echo.
echo Traduciendo archivo de entrada [ %1.txt ]
java -cp compiladorEPLOAM.jar EPLOAM  %1
echo .
echo .
if %errorlevel% == 1 (
     echo .... Archivo %1.java generado
     echo .
     echo .... Compilando %1.java
     javac Salida\%1.java
     echo .
     echo .... Ingresando a directorio Salida
     cd Salida
     echo .
     echo .... Ejecutando %1.java
     java %1
     echo .
     echo .... Regresando a directorio principal
     cd ..
     echo .
) else (
     echo .... Archivo %1.java NO fue generado
)

