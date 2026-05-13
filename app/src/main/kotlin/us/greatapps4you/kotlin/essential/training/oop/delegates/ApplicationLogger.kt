package us.greatapps4you.kotlin.essential.training.oop.delegates

class ApplicationLogger(
    private val delegate: Logger
): Logger by delegate