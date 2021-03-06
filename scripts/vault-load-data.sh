#!/bin/bash

echo "*************************************"                                                                            
echo " vault-load-data"
echo "*************************************" 

export VAULT_ADDR='http://localhost:8200'
export VAULT_TOKEN='myroot'

vault secrets list
vault kv put secret/application shared.pseudo.property="shared property value loaded from vault for application"
vault kv put secret/department-service private.pseudo.property="private property value loaded from vault for department-service"
vault kv put secret/scim-service private.pseudo.property="private property value loaded from vault for scim-service" \ private.db.username="postgres" \ private.db.password="password"
#vault kv put -format=json secret/scim-service @scim-service.json
vault kv put secret/employee-service private.pseudo.property="private property value loaded from vault for employee-service" \ private.db.username="employee-service" \ private.db.password="employee-service-password"
#vault kv put -format=json secret/employee-service @employee-service.json
vault kv put secret/eureka-service private.pseudo.property="private property value loaded from vault for eureka-service"
vault kv put secret/zuul-service private.pseudo.property="private property value loaded from vault for zuul-service"
vault kv get secret/application
vault kv get secret/department-service
vault kv get secret/employee-service
vault kv get secret/eureka-service
vault kv get secret/zuul-service

