import pymongo
class Agenda:
    def __init__(self,cliente,db,coleccion):
        self.cliente = cliente
        self.db = self.cliente[db]
        self.coleccion = self.db[coleccion]
        
    def insertar(self,contactos):  
            self.coleccion.insert_one(contactos)
    def eliminar(self,nombre):
        self.coleccion.delete_one({"nombre":nombre})
    def actualizar(self, nombre, nuevo_nombre, nuevo_apellido, nuevo_numero):
        query = {"nombre": nombre}
        update = {"$set": {"nombre": nuevo_nombre, "apellido": nuevo_apellido, "numero": nuevo_numero}}
        result = self.coleccion.update_one(query, update)
        if result.modified_count > 0:
            print("Contacto actualizado correctamente")
        else:
            print("No se encontró el contacto en la base de datos")
    def ver_contactos(self):
        contactos = self.coleccion.find({})
        contactos_arr = []
        
        for contacto in contactos:
            print("Nombre:", contacto["nombre"])
            print("Apellido:", contacto["apellido"])
            print("Numero:", contacto["numero"])
            print("-----------------------------------------")
            contactos_arr.append(contacto)
        return contactos_arr