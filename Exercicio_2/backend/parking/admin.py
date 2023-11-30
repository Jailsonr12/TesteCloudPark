from django.contrib import admin
from .models import *

# Register your models here.
admin.site.register(Customer)
admin.site.register(Vehicle)
admin.site.register(Plan)
admin.site.register(CustomerPlan)
admin.site.register(Contract)
admin.site.register(ContractRule)
admin.site.register(ParkMovement)