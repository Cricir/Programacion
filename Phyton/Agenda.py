import pymongo
import Metodos

client=pymongo.MongoClient("mongodb://localhost:27017/")
#db = client["DAW"]
#coleccion = db["Daw"]
agenda=Metodos.Agenda(client,"DAW","DAW")

opcion = 0
while opcion != 5:
    print("--------------------------------------")
    print("1. Insertar contacto")
    print("2. Borrar contacto")
    print("3. Actualizar contactos")
    print("4. Ver contactos")
    print("5. Salir")
    print("--------------------------------------")
    opcion = int(input("Seleccione una opcion: ")) 
    if opcion == 1:
        usuarioN = input("Digame el nombre a crear: ") 
        apellidoN = input("Digame el apellido a crear: ")  
        numeroN = input("Digame el numero a crear: ")  
        if usuarioN == "" or apellidoN == "" or numeroN == "":
            print("Campo sin pasar") 
        else:
            contactos = {"nombre": usuarioN, "apellido": apellidoN, "numero": numeroN}
            agenda.insertar(contactos)
    elif opcion == 2:
        nombre=input("Introduce el contacto a borrar:")
        print(" ")
        agenda.eliminar(nombre)
        print("se borro correctamente")
    elif opcion == 3:
        nombre = input("Introduce el contacto a actualizar: ")
        nuevo_nombre = input("Introduce el nuevo nombre: ")
        nuevo_apellido = input("Introduce el nuevo apellido: ")
        nuevo_numero = input("Introduce el nuevo número: ")
        agenda.actualizar(nombre, nuevo_nombre, nuevo_apellido, nuevo_numero)
    elif opcion == 4:
        print("Contactos: ")
        contactos=agenda.ver_contactos()        #lo hare en array para su uso del ejercicio y veas que se
        for elemento in contactos:
            print(elemento)
    elif opcion == 5:
        print(contactos)
        print("Saliendo del programa...")
    else:
        print("Opcion no valida, por favor seleccione una opcion del menu.")