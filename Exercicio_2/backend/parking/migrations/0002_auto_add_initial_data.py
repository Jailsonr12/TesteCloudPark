from django.db import migrations
from django.utils import timezone
from parking.models import Customer, Vehicle, Plan, CustomerPlan, Contract, ContractRule, ParkMovement

def add_initial_data(apps, schema_editor):
    customer = Customer.objects.create(name='Cliente', card_id='1234567890')
    vehicle = Vehicle.objects.create(plate='ABC123', model='Modelo ', description='Descrição', customer_id=customer)
    plan = Plan.objects.create(description='Plano', value=50.0)
    customer_plan = CustomerPlan.objects.create(customer_id=customer, plan_id=plan, due_date=timezone.now())
    contract = Contract.objects.create(description='Contrato', max_value=1000.0)
    contract_rule = ContractRule.objects.create(contract_id=contract, until=12, value=75.0)
    park_movement = ParkMovement.objects.create(entry_date=timezone.now(), vehicle_id=vehicle, value=25.0)

class Migration(migrations.Migration):

    dependencies = [
        ('parking', '0001_initial'),
    ]

    operations = [
        migrations.RunPython(add_initial_data),
    ]
